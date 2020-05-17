package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasChangesChangedEventArgs extends js.Object {
  var entityManager: EntityManager = js.native
  var hasChanges: Boolean = js.native
}

object HasChangesChangedEventArgs {
  @scala.inline
  def apply(entityManager: EntityManager, hasChanges: Boolean): HasChangesChangedEventArgs = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasChangesChangedEventArgs]
  }
  @scala.inline
  implicit class HasChangesChangedEventArgsOps[Self <: HasChangesChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityManager(value: EntityManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChanges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

