package typingsSlinky.mongoose.mod

import typingsSlinky.mongoose.Typeofmongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelProperties extends js.Object {
  /** Base Mongoose instance the model uses. */
  var base: Typeofmongoose = js.native
  /**
    * If this is a discriminator model, baseModelName is the
    * name of the base model.
    */
  var baseModelName: js.UndefOr[String] = js.native
  /** Collection the model uses. */
  var collection: Collection = js.native
  /** Connection the model uses. */
  var db: Connection_ = js.native
  /** Registered discriminators for this model. */
  var discriminators: js.Any = js.native
  /** The name of the model */
  var modelName: String = js.native
  /** Schema the model uses. */
  var schema: Schema[_] = js.native
}

object ModelProperties {
  @scala.inline
  def apply(
    base: Typeofmongoose,
    collection: Collection,
    db: Connection_,
    discriminators: js.Any,
    modelName: String,
    schema: Schema[_]
  ): ModelProperties = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], discriminators = discriminators.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelProperties]
  }
  @scala.inline
  implicit class ModelPropertiesOps[Self <: ModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Typeofmongoose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollection(value: Collection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDb(value: Connection_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscriminators(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: Schema[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseModelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseModelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseModelName")(js.undefined)
        ret
    }
  }
  
}

