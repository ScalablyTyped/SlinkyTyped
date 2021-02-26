package typingsSlinky.k6

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object htmlMod {
  
  type Handler = js.Function2[/* index */ scala.Double, /* element */ typingsSlinky.k6.htmlMod.Element, scala.Unit]
  
  type Mapper = js.Function2[/* index */ scala.Double, /* element */ typingsSlinky.k6.htmlMod.Element, js.Any]
  
  type Tester = js.Function2[
    /* index */ scala.Double, 
    /* element */ typingsSlinky.k6.htmlMod.Element, 
    scala.Boolean
  ]
  
  @scala.inline
  def parseHTML(html: java.lang.String): typingsSlinky.k6.htmlMod.Selection = typingsSlinky.k6.htmlMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(html.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.k6.htmlMod.Selection]
}
