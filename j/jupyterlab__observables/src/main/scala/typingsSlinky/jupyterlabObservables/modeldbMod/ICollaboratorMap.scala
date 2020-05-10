package typingsSlinky.jupyterlabObservables.modeldbMod

import typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollaboratorMap extends IObservableMap[ICollaborator] {
  /**
    * The local collaborator on a model.
    */
  val localCollaborator: ICollaborator = js.native
}

object ICollaboratorMap {
  @scala.inline
  def apply(
    changed: ISignal[ICollaboratorMap, IChangedArgs[ICollaborator]],
    clear: () => Unit,
    delete: String => js.UndefOr[ICollaborator],
    dispose: () => Unit,
    get: String => js.UndefOr[ICollaborator],
    has: String => Boolean,
    isDisposed: Boolean,
    keys: () => js.Array[String],
    localCollaborator: ICollaborator,
    set: (String, ICollaborator) => js.UndefOr[ICollaborator],
    size: Double,
    `type`: Map,
    values: () => js.Array[ICollaborator]
  ): ICollaboratorMap = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = js.Any.fromFunction0(keys), localCollaborator = localCollaborator.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollaboratorMap]
  }
  @scala.inline
  implicit class ICollaboratorMapOps[Self <: ICollaboratorMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalCollaborator(value: ICollaborator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

