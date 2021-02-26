package typingsSlinky.loopback.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When two changes conflict a conflict is created
  * **Note**: call `conflict.fetch()` to get the `target` and `source` models
  *
  * @param {*} modelId
  * @param {PersistedModel} SourceModel
  * @param {PersistedModel} TargetModel
  * @property {ModelClass} source The source model instance
  * @property {ModelClass} target The target model instance
  * @class Change.Conflic
  */
@JSImport("loopback", "Conflict")
@js.native
class Conflict protected () extends StObject {
  def this(modelId: js.Any, SourceModel: PersistedModel, TargetModel: PersistedModel) = this()
  
  /**
    * Get the conflicting changes
    * @callback {() => void} callback
    * @param {Error} err
    * @param {Change} sourceChange
    * @param {Change} targetChang
    */
  def changes(
    callback: js.Function3[/* err */ js.Error, /* sourceChange */ Change, /* targetChange */ Change, Unit]
  ): Unit = js.native
  
  /**
    * Fetch the conflicting models
    * @callback {() => void} callback
    * @param {Error} err
    * @param {PersistedModel} source
    * @param {PersistedModel} targe
    */
  def models(
    callback: js.Function3[/* err */ js.Error, /* source */ PersistedModel, /* target */ PersistedModel, Unit]
  ): Unit = js.native
  
  /**
    * Resolve the conflict
    * Set the source change's previous revision to the current revision of the
    * (conflicting) target change. Since the changes are no longer conflicting
    * and appear as if the source change was based on the target, they will be
    * replicated normally as part of the next replicate() call
    * This is effectively resolving the conflict using the source version
    * @callback {() => void} callback
    * @param {Error} err
    */
  def resolve(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Resolve the conflict using the supplied instance data
    * @param {any} data The set of changes to apply on the model
    * instance. Use `null` value to delete the source instance instead.
    * @callback {() => void} callback
    * @param {Error} err
    */
  def resolveManually(data: js.Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Resolve the conflict using the instance data in the source model
    * @callback {() => void} callback
    * @param {Error} err
    */
  def resolveUsingSource(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Resolve the conflict using the instance data in the target model
    * @callback {() => void} callback
    * @param {Error} err
    */
  def resolveUsingTarget(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  var source: js.Any = js.native
  
  /**
    * Return a new Conflict instance with swapped Source and Target models
    * This is useful when resolving a conflict in one-way
    * replication, where the source data must not be changed
    *
    * ```js
    * conflict.swapParties().resolveUsingTarget(cb);
    * ```
    * @returns {Conflict} A new Conflict instance
    */
  def swapParties(): Conflict = js.native
  
  var target: js.Any = js.native
  
  /**
    * Determine the conflict type
    * Possible results ar
    *
    * - `Change.UPDATE`: Source and target models were updated
    * - `Change.DELETE`: Source and or target model was deleted.
    * - `Change.UNKNOWN`: the conflict type is uknown or due to an erro
    *
    * @callback {() => void} callback
    * @param {Error} err
    * @param {string} type The conflict type
    */
  def `type`(callback: js.Function2[/* err */ js.Error, /* type */ String, Unit]): Unit = js.native
}
