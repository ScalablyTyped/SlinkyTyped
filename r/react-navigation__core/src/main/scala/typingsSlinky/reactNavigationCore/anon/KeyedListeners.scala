package typingsSlinky.reactNavigationCore.anon

import typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typingsSlinky.reactNavigationCore.reactNavigationCoreStrings.getState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyedListeners extends StObject {
  
  def addKeyedListener[T /* <: beforeRemove | getState */](
    `type`: T,
    key: String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[T] */ js.Any
  ): js.Function0[Unit] = js.native
  
  var keyedListeners: BeforeRemove = js.native
}
object KeyedListeners {
  
  @scala.inline
  def apply(
    addKeyedListener: (js.Any, String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[T] */ js.Any) => js.Function0[Unit],
    keyedListeners: BeforeRemove
  ): KeyedListeners = {
    val __obj = js.Dynamic.literal(addKeyedListener = js.Any.fromFunction3(addKeyedListener), keyedListeners = keyedListeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyedListeners]
  }
  
  @scala.inline
  implicit class KeyedListenersMutableBuilder[Self <: KeyedListeners] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddKeyedListener(
      value: (js.Any, String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[T] */ js.Any) => js.Function0[Unit]
    ): Self = StObject.set(x, "addKeyedListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setKeyedListeners(value: BeforeRemove): Self = StObject.set(x, "keyedListeners", value.asInstanceOf[js.Any])
  }
}
