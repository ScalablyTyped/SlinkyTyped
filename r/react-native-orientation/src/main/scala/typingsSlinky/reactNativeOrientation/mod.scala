package typingsSlinky.reactNativeOrientation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-orientation", "addOrientationListener")
  @js.native
  def addOrientationListener(callback: js.Function1[/* orientation */ orientation, Unit]): Unit = js.native
  
  @JSImport("react-native-orientation", "addSpecificOrientationListener")
  @js.native
  def addSpecificOrientationListener(callback: js.Function1[/* specificOrientation */ specificOrientation, Unit]): Unit = js.native
  
  @JSImport("react-native-orientation", "getInitialOrientation")
  @js.native
  def getInitialOrientation(): orientation = js.native
  
  @JSImport("react-native-orientation", "getOrientation")
  @js.native
  def getOrientation(callback: js.Function2[/* err */ js.Error, /* orientation */ orientation, Unit]): Unit = js.native
  
  @JSImport("react-native-orientation", "getSpecificOrientation")
  @js.native
  def getSpecificOrientation(callback: js.Function2[/* err */ js.Error, /* orientation */ specificOrientation, Unit]): Unit = js.native
  
  @JSImport("react-native-orientation", "lockToLandscape")
  @js.native
  def lockToLandscape(): Unit = js.native
  
  @JSImport("react-native-orientation", "lockToLandscapeLeft")
  @js.native
  def lockToLandscapeLeft(): Unit = js.native
  
  @JSImport("react-native-orientation", "lockToLandscapeRight")
  @js.native
  def lockToLandscapeRight(): Unit = js.native
  
  @JSImport("react-native-orientation", "lockToPortrait")
  @js.native
  def lockToPortrait(): Unit = js.native
  
  @JSImport("react-native-orientation", "removeOrientationListener")
  @js.native
  def removeOrientationListener(callback: js.Function1[/* orientation */ orientation, Unit]): Unit = js.native
  
  @JSImport("react-native-orientation", "removeSpecificOrientationListener")
  @js.native
  def removeSpecificOrientationListener(callback: js.Function1[/* specificOrientation */ specificOrientation, Unit]): Unit = js.native
  
  @JSImport("react-native-orientation", "unlockAllOrientations")
  @js.native
  def unlockAllOrientations(): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.LANDSCAPE
    - typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT
    - typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN
    - typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN
  */
  trait orientation extends StObject
  object orientation {
    
    @scala.inline
    def LANDSCAPE: typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.LANDSCAPE = "LANDSCAPE".asInstanceOf[typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.LANDSCAPE]
    
    @scala.inline
    def PORTRAIT: typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT = "PORTRAIT".asInstanceOf[typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT]
    
    @scala.inline
    def PORTRAITUPSIDEDOWN: typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN = "PORTRAITUPSIDEDOWN".asInstanceOf[typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN]
    
    @scala.inline
    def UNKNOWN: typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-LEFT`
    - typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-RIGHT`
    - typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT
    - typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN
    - typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN
  */
  trait specificOrientation extends StObject
  object specificOrientation {
    
    @scala.inline
    def `LANDSCAPE-LEFT`: typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-LEFT` = "LANDSCAPE-LEFT".asInstanceOf[typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-LEFT`]
    
    @scala.inline
    def `LANDSCAPE-RIGHT`: typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-RIGHT` = "LANDSCAPE-RIGHT".asInstanceOf[typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.`LANDSCAPE-RIGHT`]
    
    @scala.inline
    def PORTRAIT: typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT = "PORTRAIT".asInstanceOf[typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT]
    
    @scala.inline
    def PORTRAITUPSIDEDOWN: typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN = "PORTRAITUPSIDEDOWN".asInstanceOf[typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN]
    
    @scala.inline
    def UNKNOWN: typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN]
  }
}
