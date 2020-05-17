package typingsSlinky.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sinonMod {
  type SinonStatic = typingsSlinky.cypress.sinonMod.SinonSandbox with typingsSlinky.cypress.sinonMod.LegacySandbox with typingsSlinky.cypress.sinonMod.SinonApi
  /**
    * An instance of a stubbed object type with functions replaced by stubs.
    *
    * @template TType Object type being stubbed.
    */
  type SinonStubbedInstance[TType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TType ]: cypress.cypress/types/sinon.SinonStubbedMember<TType[P]>}
    */ typingsSlinky.cypress.cypressStrings.SinonStubbedInstance with org.scalablytyped.runtime.TopLevel[TType]
}
