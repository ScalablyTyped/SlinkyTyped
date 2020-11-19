package typingsSlinky.saxes.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.saxes.saxesStrings.attribute
import typingsSlinky.saxes.saxesStrings.cdata
import typingsSlinky.saxes.saxesStrings.closetag
import typingsSlinky.saxes.saxesStrings.comment
import typingsSlinky.saxes.saxesStrings.doctype
import typingsSlinky.saxes.saxesStrings.end
import typingsSlinky.saxes.saxesStrings.error
import typingsSlinky.saxes.saxesStrings.opentag
import typingsSlinky.saxes.saxesStrings.opentagstart
import typingsSlinky.saxes.saxesStrings.processinginstruction
import typingsSlinky.saxes.saxesStrings.ready
import typingsSlinky.saxes.saxesStrings.text
import typingsSlinky.saxes.saxesStrings.xmldecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("saxes", "EVENTS")
@js.native
object EVENTS
  extends TopLevel[
      js.Tuple13[
        xmldecl, 
        text, 
        processinginstruction, 
        doctype, 
        comment, 
        opentagstart, 
        attribute, 
        opentag, 
        closetag, 
        cdata, 
        error, 
        end, 
        ready
      ]
    ]
