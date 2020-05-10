package typingsSlinky.pulumiPulumi.dynamicMod

import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceProvider extends js.Object {
  /**
    * Check validates that the given property bag is valid for a resource of the given type.
    *
    * @param olds The old input properties to use for validation.
    * @param news The new input properties to use for validation.
    */
  var check: js.UndefOr[js.Function2[/* olds */ js.Any, /* news */ js.Any, js.Promise[CheckResult]]] = js.native
  /**
    * Delete tears down an existing resource with the given ID.  If it fails, the resource is assumed to still exist.
    *
    * @param id The ID of the resource to delete.
    * @param props The current properties on the resource.
    */
  var delete: js.UndefOr[js.Function2[/* id */ ID, /* props */ js.Any, js.Promise[Unit]]] = js.native
  /**
    * Diff checks what impacts a hypothetical update will have on the resource's properties.
    *
    * @param id The ID of the resource to diff.
    * @param olds The old values of properties to diff.
    * @param news The new values of properties to diff.
    */
  var diff: js.UndefOr[
    js.Function3[/* id */ ID, /* olds */ js.Any, /* news */ js.Any, js.Promise[DiffResult]]
  ] = js.native
  /**
    * Reads the current live state associated with a resource.  Enough state must be included in the inputs to uniquely
    * identify the resource; this is typically just the resource ID, but it may also include some properties.
    */
  var read: js.UndefOr[
    js.Function2[/* id */ ID, /* props */ js.UndefOr[js.Any], js.Promise[ReadResult]]
  ] = js.native
  /**
    * Update updates an existing resource with new values.
    *
    * @param id The ID of the resource to update.
    * @param olds The old values of properties to update.
    * @param news The new values of properties to update.
    */
  var update: js.UndefOr[
    js.Function3[/* id */ ID, /* olds */ js.Any, /* news */ js.Any, js.Promise[UpdateResult]]
  ] = js.native
  /**
    * Create allocates a new instance of the provided resource and returns its unique ID afterwards.
    * If this call fails, the resource must not have been created (i.e., it is "transactional").
    *
    * @param inputs The properties to set during creation.
    */
  def create(inputs: js.Any): js.Promise[CreateResult] = js.native
}

object ResourceProvider {
  @scala.inline
  def apply(create: js.Any => js.Promise[CreateResult]): ResourceProvider = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ResourceProvider]
  }
  @scala.inline
  implicit class ResourceProviderOps[Self <: ResourceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: js.Any => js.Promise[CreateResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCheck(value: (/* olds */ js.Any, /* news */ js.Any) => js.Promise[CheckResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: (/* id */ ID, /* props */ js.Any) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withDiff(value: (/* id */ ID, /* olds */ js.Any, /* news */ js.Any) => js.Promise[DiffResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDiff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: (/* id */ ID, /* props */ js.UndefOr[js.Any]) => js.Promise[ReadResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: (/* id */ ID, /* olds */ js.Any, /* news */ js.Any) => js.Promise[UpdateResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

