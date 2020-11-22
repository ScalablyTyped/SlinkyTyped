package typingsSlinky.emotionReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jsxNamespaceMod {
  
  // unpack all here to avoid infinite self-referencing when defining our own JSX namespace
  type ReactJSXElement = slinky.core.facade.ReactElement
  
  type ReactJSXElementAttributesProperty = typingsSlinky.react.mod.global.JSX.ElementAttributesProperty
  
  type ReactJSXElementChildrenAttribute = typingsSlinky.react.mod.global.JSX.ElementChildrenAttribute
  
  type ReactJSXElementClass = typingsSlinky.react.mod.global.JSX.ElementClass
  
  type ReactJSXIntrinsicAttributes = typingsSlinky.react.mod.global.JSX.IntrinsicAttributes
  
  type ReactJSXIntrinsicClassAttributes[T] = typingsSlinky.react.mod.global.JSX.IntrinsicClassAttributes[T]
  
  type ReactJSXIntrinsicElements = typingsSlinky.react.mod.global.JSX.IntrinsicElements
  
  type ReactJSXLibraryManagedAttributes[C, P] = typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes[C, P]
  
  type WithConditionalCSSProp[P] = P | (P with typingsSlinky.emotionReact.anon.Css)
}
