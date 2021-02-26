package typingsSlinky.antDesignReactNative.mod

import typingsSlinky.antDesignReactNative.anon.AntLocale
import typingsSlinky.antDesignReactNative.anon.OnBlur
import typingsSlinky.antDesignReactNative.searchBarMod.SearchBarProps
import typingsSlinky.antDesignReactNative.searchBarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "SearchBar")
@js.native
class SearchBar protected () extends default {
  def this(props: SearchBarProps) = this()
}
/* static members */
object SearchBar {
  
  @JSImport("@ant-design/react-native", "SearchBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "SearchBar.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  @scala.inline
  def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "SearchBar.defaultProps")
  @js.native
  def defaultProps: OnBlur = js.native
  @scala.inline
  def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
