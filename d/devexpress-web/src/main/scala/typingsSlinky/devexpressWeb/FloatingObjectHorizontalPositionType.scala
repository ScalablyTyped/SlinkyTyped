package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FloatingObjectHorizontalPositionType extends StObject
/**
  * Lists values specifying to what element the horizontal position of a floating object is relative.
  */
@JSGlobal("FloatingObjectHorizontalPositionType")
@js.native
object FloatingObjectHorizontalPositionType extends StObject {
  
  /**
    * Relative to character.
    */
  @js.native
  sealed trait Character extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to column.
    */
  @js.native
  sealed trait Column extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to left margin.
    */
  @js.native
  sealed trait LeftMargin extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to right margin.
    */
  @js.native
  sealed trait RightMargin extends FloatingObjectHorizontalPositionType
}
