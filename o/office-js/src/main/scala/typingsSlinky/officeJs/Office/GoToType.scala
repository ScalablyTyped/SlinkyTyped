package typingsSlinky.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GoToType extends StObject
/**
  * Specifies the type of place or object to navigate to.
  */
@JSGlobal("Office.GoToType")
@js.native
object GoToType extends StObject {
  
  /**
    * Goes to a binding object using the specified binding id.
    * 
    * Supported hosts: Excel, Word
    */
  @js.native
  sealed trait Binding extends GoToType
  
  /**
    * Goes to the specified index by slide number or {@link Office.Index}.
    * 
    * Supported hosts: PowerPoint
    */
  @js.native
  sealed trait Index extends GoToType
  
  /**
    * Goes to a named item using that item's name.
    * In Excel, you can use any structured reference for a named range or table: "Worksheet2!Table1"
    * 
    * Supported hosts: Excel
    */
  @js.native
  sealed trait NamedItem extends GoToType
  
  /**
    * Goes to a slide using the specified id.
    * 
    * Supported hosts: PowerPoint
    */
  @js.native
  sealed trait Slide extends GoToType
}
