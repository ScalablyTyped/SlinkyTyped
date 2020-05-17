package typingsSlinky.cypress.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Cypress {
  type Agent[T /* <: typingsSlinky.cypress.sinonMod.SinonSpy */] = typingsSlinky.cypress.cypressMod.Cypress.SinonSpyAgent[T] with T
  // Diff taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-311923766
  type Diff[T /* <: java.lang.String */, U /* <: java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type HttpMethod = java.lang.String
  type ObjectLike = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  /**
    * Public interface for the global "cy" object. If you want to add
    * a custom property to this object, you should extend this interface.
    * @see https://on.cypress.io/typescript#Types-for-custom-commands
    *
    ```
    // in your TS file
    declare namespace Cypress {
    interface cy {
    // declare additional properties on "cy" object, like
    // label: string
    }
    interface Chainable {
    // declare additional custom commands as methods, like
    // login(username: string, password: string)
    }
    }
    ```
    */
  type cy = typingsSlinky.cypress.cypressMod.Cypress.Chainable[js.UndefOr[scala.Nothing]]
}
