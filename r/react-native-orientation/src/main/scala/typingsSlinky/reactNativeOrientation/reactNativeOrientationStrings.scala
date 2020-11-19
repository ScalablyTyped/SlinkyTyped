package typingsSlinky.reactNativeOrientation

import typingsSlinky.reactNativeOrientation.mod.orientation
import typingsSlinky.reactNativeOrientation.mod.specificOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeOrientationStrings {
  
  @scala.inline
  def LANDSCAPE: LANDSCAPE = "LANDSCAPE".asInstanceOf[LANDSCAPE]
  
  @scala.inline
  def `LANDSCAPE-LEFT`: `LANDSCAPE-LEFT` = "LANDSCAPE-LEFT".asInstanceOf[`LANDSCAPE-LEFT`]
  
  @scala.inline
  def `LANDSCAPE-RIGHT`: `LANDSCAPE-RIGHT` = "LANDSCAPE-RIGHT".asInstanceOf[`LANDSCAPE-RIGHT`]
  
  @scala.inline
  def PORTRAIT: PORTRAIT = "PORTRAIT".asInstanceOf[PORTRAIT]
  
  @scala.inline
  def PORTRAITUPSIDEDOWN: PORTRAITUPSIDEDOWN = "PORTRAITUPSIDEDOWN".asInstanceOf[PORTRAITUPSIDEDOWN]
  
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait LANDSCAPE extends orientation
  
  @js.native
  sealed trait `LANDSCAPE-LEFT` extends specificOrientation
  
  @js.native
  sealed trait `LANDSCAPE-RIGHT` extends specificOrientation
  
  @js.native
  sealed trait PORTRAIT
    extends orientation
       with specificOrientation
  
  @js.native
  sealed trait PORTRAITUPSIDEDOWN
    extends orientation
       with specificOrientation
  
  @js.native
  sealed trait UNKNOWN
    extends orientation
       with specificOrientation
}
