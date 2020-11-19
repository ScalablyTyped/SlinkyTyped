package typingsSlinky.reactNativeVectorIcons.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeVectorIcons.iconMod.Icon
import typingsSlinky.reactNativeVectorIcons.iconMod.ImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable extends Instantiable0[Icon] {
  
  var Button: Instantiable0[typingsSlinky.reactNativeVectorIcons.iconMod.Icon.Button] = js.native
  
  var TabBarItem: Instantiable0[typingsSlinky.reactNativeVectorIcons.iconMod.Icon.TabBarItem] = js.native
  
  var TabBarItemIOS: Instantiable0[typingsSlinky.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS] = js.native
  
  var ToolbarAndroid: Instantiable0[typingsSlinky.reactNativeVectorIcons.iconMod.Icon.ToolbarAndroid] = js.native
  
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: js.UndefOr[scala.Nothing], color: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  
  def hasIcon(name: String): Boolean = js.native
  
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}
