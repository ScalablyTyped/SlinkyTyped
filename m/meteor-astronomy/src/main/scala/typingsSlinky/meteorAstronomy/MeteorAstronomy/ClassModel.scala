package typingsSlinky.meteorAstronomy.MeteorAstronomy

import typingsSlinky.meteor.Mongo.Collection
import typingsSlinky.meteorAstronomy.AnonInsert
import typingsSlinky.meteorAstronomy.meteorAstronomyStrings._id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassModel[T] extends js.Object {
  var behaviors: js.UndefOr[js.Object] = js.native
  var collection: js.UndefOr[Collection[T]] = js.native
  var events: js.UndefOr[js.Object] = js.native
  var fields: Fields[Omit[T, _id]] = js.native
  var helpers: js.UndefOr[Helpers[T]] = js.native
  var indexes: js.UndefOr[js.Object] = js.native
  var meteorMethods: js.UndefOr[js.Object] = js.native
  var name: String = js.native
  var secured: js.UndefOr[AnonInsert | Boolean] = js.native
}

object ClassModel {
  @scala.inline
  def apply[T](fields: Fields[Omit[T, _id]], name: String): ClassModel[T] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassModel[T]]
  }
  @scala.inline
  implicit class ClassModelOps[Self[t] <: ClassModel[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFields(value: Fields[Omit[T, _id]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBehaviors(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(js.undefined)
        ret
    }
    @scala.inline
    def withCollection(value: Collection[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpers(value: Helpers[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpers: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexes(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(js.undefined)
        ret
    }
    @scala.inline
    def withMeteorMethods(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meteorMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeteorMethods: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meteorMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withSecured(value: AnonInsert | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecured: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secured")(js.undefined)
        ret
    }
  }
  
}

