package typingsSlinky.rax.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JSX {
  
  // tslint:disable-next-line:no-empty-interface
  type Element = typingsSlinky.rax.mod.RaxElement[js.Any, js.Any]
  
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicAttributes = typingsSlinky.rax.mod.Attributes
  
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicClassAttributes[T] = typingsSlinky.rax.mod.ClassAttributes[T]
  
  // We can't recurse forever because `type` can't be self-referential;
  // let's assume it's reasonable to do a single Rax.lazy() around a single Rax.memo() / vice-versa
  type LibraryManagedAttributes[C, P] = typingsSlinky.rax.mod.RaxManagedAttributes[js.Any | C, P]
}
