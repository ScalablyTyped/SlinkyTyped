package typingsSlinky.reactNativeGestureHandler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def GestureHandlerRootView: slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ViewProps] = typingsSlinky.reactNativeGestureHandler.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GestureHandlerRootView").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ViewProps]]
  
  @scala.inline
  def createNativeWrapper[P](
    Component: slinky.core.ReactComponentClass[P],
    config: typingsSlinky.reactNativeGestureHandler.mod.NativeViewGestureHandlerProperties
  ): slinky.core.ReactComponentClass[P] = (typingsSlinky.reactNativeGestureHandler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNativeWrapper")(Component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[slinky.core.ReactComponentClass[P]]
  
  @scala.inline
  def gestureHandlerRootHOC[P](Component: slinky.core.ReactComponentClass[P]): slinky.core.ReactComponentClass[P] = typingsSlinky.reactNativeGestureHandler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gestureHandlerRootHOC")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[P]]
  @scala.inline
  def gestureHandlerRootHOC[P](
    Component: slinky.core.ReactComponentClass[P],
    containerStyles: typingsSlinky.reactNative.mod.StyleProp[typingsSlinky.reactNative.mod.ViewStyle]
  ): slinky.core.ReactComponentClass[P] = (typingsSlinky.reactNativeGestureHandler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gestureHandlerRootHOC")(Component.asInstanceOf[js.Any], containerStyles.asInstanceOf[js.Any])).asInstanceOf[slinky.core.ReactComponentClass[P]]
}
