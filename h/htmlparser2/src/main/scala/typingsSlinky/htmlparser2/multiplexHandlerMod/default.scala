package typingsSlinky.htmlparser2.multiplexHandlerMod

import typingsSlinky.htmlparser2.htmlparser2Strings.onattribute
import typingsSlinky.htmlparser2.htmlparser2Strings.oncdataend
import typingsSlinky.htmlparser2.htmlparser2Strings.oncdatastart
import typingsSlinky.htmlparser2.htmlparser2Strings.onclosetag
import typingsSlinky.htmlparser2.htmlparser2Strings.oncomment
import typingsSlinky.htmlparser2.htmlparser2Strings.oncommentend
import typingsSlinky.htmlparser2.htmlparser2Strings.onend
import typingsSlinky.htmlparser2.htmlparser2Strings.onerror
import typingsSlinky.htmlparser2.htmlparser2Strings.onopentag
import typingsSlinky.htmlparser2.htmlparser2Strings.onopentagname
import typingsSlinky.htmlparser2.htmlparser2Strings.onparserinit
import typingsSlinky.htmlparser2.htmlparser2Strings.onprocessinginstruction
import typingsSlinky.htmlparser2.htmlparser2Strings.onreset
import typingsSlinky.htmlparser2.htmlparser2Strings.ontext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2/lib/MultiplexHandler", JSImport.Default)
@js.native
class default protected () extends MultiplexHandler {
  def this(func: js.Function2[
        /* keyof htmlparser2.htmlparser2/lib/Parser.Handler */ /* event */ onparserinit | onreset | onend | onerror | onclosetag | onopentagname | onattribute | onopentag | ontext | oncomment | oncdatastart | oncdataend | oncommentend | onprocessinginstruction, 
        /* repeated */ js.Any, 
        Unit
      ]) = this()
}

