package typingsSlinky.backboneAssociations.mod.Associations

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.backbone.mod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRelation extends js.Object {
  /** Determines the type of collection used. If used, the relatedModel property is ignored */
  var collectionType: js.UndefOr[String | Instantiable0[Collection[js.Any]]] = js.native
  /** If set to true, then the attribute will not be serialized in toJSON() calls. Defaults to false */
  var isTransient: js.UndefOr[Boolean] = js.native
  /** The key for this relationship on this model */
  var key: String = js.native
  /** A transformation function to convert the value before it is assigned to the key on the relatedModel */
  var map: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  /** The type of model for this relationship */
  var relatedModel: String | Instantiable0[AssociatedModel] = js.native
  /** Specify remoteKey to serialize the key to a different key name in toJSON() calls. Useful in ROR nested-attributes like scenarios. */
  var remoteKey: js.UndefOr[String] = js.native
  /** the attributes to serialize when calling toJSON */
  var serialize: js.UndefOr[js.Array[String]] = js.native
  // meh, no string enums in TS. Just have to trust the user not to be a fool
  /** The cardinality of this relationship. */
  var `type`: String = js.native
}

object IRelation {
  @scala.inline
  def apply(key: String, relatedModel: String | Instantiable0[AssociatedModel], `type`: String): IRelation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], relatedModel = relatedModel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRelation]
  }
  @scala.inline
  implicit class IRelationOps[Self <: IRelation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedModel(value: String | Instantiable0[AssociatedModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectionType(value: String | Instantiable0[Collection[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTransient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTransient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransient")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
  }
  
}

