package typingsSlinky.react.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JSX {
  
  type Element = slinky.core.facade.ReactElement
  
  type IntrinsicAttributes = typingsSlinky.react.mod.Attributes
  
  type IntrinsicClassAttributes[T] = typingsSlinky.react.mod.ClassAttributes[T]
  
  // We can't recurse forever because `type` can't be self-referential;
  // let's assume it's reasonable to do a single React.lazy() around a single React.memo() / vice-versa
  type LibraryManagedAttributes[C, P] = typingsSlinky.react.mod.ReactManagedAttributes[js.Any | C, P]
}
