package typingsSlinky.htmlparser2

import typingsSlinky.htmlparser2.anon.PartialHandler
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
import typingsSlinky.htmlparser2.multiplexHandlerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2/lib/CollectingHandler", JSImport.Namespace)
@js.native
object collectingHandlerMod extends js.Object {
  @js.native
  class CollectingHandler () extends default {
    def this(cbs: PartialHandler) = this()
    var _cbs: PartialHandler = js.native
    var events: js.Array[
        Array[
          onparserinit | onreset | onend | onerror | onclosetag | onopentagname | onattribute | onopentag | ontext | oncomment | oncdatastart | oncdataend | oncommentend | onprocessinginstruction | _
        ]
      ] = js.native
    def restart(): Unit = js.native
  }
  
}

