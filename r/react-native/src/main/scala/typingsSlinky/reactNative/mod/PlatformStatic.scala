package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.reactNative.anon.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformStatic extends js.Object {
  
  var Version: Double | String = js.native
  
  var isTV: Boolean = js.native
  
  def select[T](
    specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType ]:? T}
    */ typingsSlinky.reactNative.reactNativeStrings.PlatformStatic with TopLevel[js.Any]
  ): js.UndefOr[T] = js.native
  /**
    * @see https://facebook.github.io/react-native/docs/platform-specific-code.html#content
    */
  @JSName("select")
  def select_T_T[T](
    specifics: typingsSlinky.reactNative.reactNativeStrings.PlatformStatic with TopLevel[js.Any] with Default[T]
  ): T = js.native
}
