package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddOptions = typingsSlinky.nodePgMigrate.mod.IfNotExistsOption
  type ColumnDefinitions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.nodePgMigrate.mod.ColumnDefinition | java.lang.String]
  type CreatePolicyOptions = typingsSlinky.nodePgMigrate.mod.CreatePolicyOptionsEn with typingsSlinky.nodePgMigrate.mod.PolicyOptions
  type DomainOptionsAlter = typingsSlinky.nodePgMigrate.mod.DomainOptionsAlterEn with typingsSlinky.nodePgMigrate.mod.DomainOptions
  type DomainOptionsCreate = typingsSlinky.nodePgMigrate.mod.DomainOptionsCreateEn with typingsSlinky.nodePgMigrate.mod.DomainOptions
  type DropIndexOptions = typingsSlinky.nodePgMigrate.mod.DropIndexOptionsEn with typingsSlinky.nodePgMigrate.mod.DropOptions
  type DropOptions = typingsSlinky.nodePgMigrate.mod.IfExistsOption with typingsSlinky.nodePgMigrate.mod.CascadeOption
  type FunctionParam = java.lang.String | typingsSlinky.nodePgMigrate.mod.FunctionParamType
  type LiteralUnion[T /* <: U */, U] = T | (U with js.Object)
  type Name = java.lang.String | typingsSlinky.nodePgMigrate.AnonName
  type RunnerOption = typingsSlinky.nodePgMigrate.mod.RunnerOptionConfig with (typingsSlinky.nodePgMigrate.mod.RunnerOptionClient | typingsSlinky.nodePgMigrate.mod.RunnerOptionUrl)
  type SequenceOptionsAlter = typingsSlinky.nodePgMigrate.mod.SequenceOptionsAlterEn with typingsSlinky.nodePgMigrate.mod.SequenceOptions
  type SequenceOptionsCreate = typingsSlinky.nodePgMigrate.mod.SequenceOptionsCreateEn with typingsSlinky.nodePgMigrate.mod.SequenceOptions
  type Type = java.lang.String | typingsSlinky.nodePgMigrate.AnonType
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typingsSlinky.nodePgMigrate.mod.PgLiteral
    - typingsSlinky.nodePgMigrate.mod.ValueArray
  */
  type Value = typingsSlinky.nodePgMigrate.mod._Value | scala.Null | scala.Boolean | java.lang.String | scala.Double
}
