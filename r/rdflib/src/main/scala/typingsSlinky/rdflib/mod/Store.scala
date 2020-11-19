package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.formulaMod.FormulaOpts
import typingsSlinky.rdflib.storeMod.FeaturesType
import typingsSlinky.rdflib.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib", "Store")
@js.native
/**
  * Creates a new formula
  * @param features - What sort of autmatic processing to do? Array of string
  * @param features.sameAs - Smush together A and B nodes whenever { A sameAs B }
  * @param opts
  * @param [opts.rdfFactory] - The data factory that should be used by the store
  * @param [opts.rdfArrayRemove] - Function which removes statements from the store
  * @param [opts.dataCallback] - Callback when a statement is added to the store, will not trigger when adding duplicates
  */
class Store () extends default {
  def this(features: FeaturesType) = this()
  def this(features: js.UndefOr[FeaturesType], opts: FormulaOpts) = this()
}
/* static members */
@JSImport("rdflib", "Store")
@js.native
object Store extends js.Object {
  
  /**
    * Gets the URI of the default graph
    */
  def defaultGraphURI: String = js.native
  
  var handleRDFType: js.Function = js.native
}
