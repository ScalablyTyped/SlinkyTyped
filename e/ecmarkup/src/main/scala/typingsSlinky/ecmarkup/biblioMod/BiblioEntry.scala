package typingsSlinky.ecmarkup.biblioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecmarkup.biblioMod.AlgorithmBiblioEntry
  - typingsSlinky.ecmarkup.biblioMod.ProductionBiblioEntry
  - typingsSlinky.ecmarkup.biblioMod.ClauseBiblioEntry
  - typingsSlinky.ecmarkup.biblioMod.TermBiblioEntry
  - typingsSlinky.ecmarkup.biblioMod.FigureBiblioEntry
*/
trait BiblioEntry extends js.Object

object BiblioEntry {
  @scala.inline
  implicit def apply(value: AlgorithmBiblioEntry): BiblioEntry = value.asInstanceOf[BiblioEntry]
  @scala.inline
  implicit def apply(value: ClauseBiblioEntry): BiblioEntry = value.asInstanceOf[BiblioEntry]
  @scala.inline
  implicit def apply(value: FigureBiblioEntry): BiblioEntry = value.asInstanceOf[BiblioEntry]
  @scala.inline
  implicit def apply(value: ProductionBiblioEntry): BiblioEntry = value.asInstanceOf[BiblioEntry]
  @scala.inline
  implicit def apply(value: TermBiblioEntry): BiblioEntry = value.asInstanceOf[BiblioEntry]
}

