package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.formulaMod.FormulaOpts
import typingsSlinky.rdflib.formulaMod.default
import typingsSlinky.rdflib.typesMod.GraphType
import typingsSlinky.rdflib.typesMod.ObjectType
import typingsSlinky.rdflib.typesMod.PredicateType
import typingsSlinky.rdflib.typesMod.SubjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Formula")
@js.native
/**
  * Initializes this formula
  * @constructor
  * @param statements - Initial array of statements
  * @param constraints - initial array of constraints
  * @param initBindings - initial bindings used in Query
  * @param optional - optional
  * @param opts
  * @param opts.rdfFactory - The rdf factory that should be used by the store
  */
class Formula () extends default {
  def this(statements: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ]) = this()
  def this(
    statements: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ],
    constraints: js.Array[_]
  ) = this()
  def this(
    statements: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ],
    constraints: js.Array[_],
    initBindings: js.Array[_]
  ) = this()
  def this(
    statements: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ],
    constraints: js.Array[_],
    initBindings: js.Array[_],
    optional: js.Array[_]
  ) = this()
  def this(
    statements: js.Array[
        typingsSlinky.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
      ],
    constraints: js.Array[_],
    initBindings: js.Array[_],
    optional: js.Array[_],
    opts: FormulaOpts
  ) = this()
}

