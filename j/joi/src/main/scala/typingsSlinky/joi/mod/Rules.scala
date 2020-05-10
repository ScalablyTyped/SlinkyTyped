package typingsSlinky.joi.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rules[P /* <: js.Object */] extends js.Object {
  var description: js.UndefOr[String | (js.Function1[/* params */ P, String])] = js.native
  var name: String = js.native
  var params: js.UndefOr[
    ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof P ]: joi.joi.SchemaLike}
    */ typingsSlinky.joi.joiStrings.Rules with TopLevel[js.Any])
  ] = js.native
  var setup: js.UndefOr[js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit]] = js.native
  var validate: js.UndefOr[
    js.ThisFunction4[
      /* this */ ExtensionBoundSchema, 
      /* params */ P, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.native
}

object Rules {
  @scala.inline
  def apply[P](name: String): Rules[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules[P]]
  }
  @scala.inline
  implicit class RulesOps[Self[p] <: Rules[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withName(value: String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionFunction1(value: /* params */ P => String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDescription(value: String | (js.Function1[/* params */ P, String])): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(
      value: ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof P ]: joi.joi.SchemaLike}
      */ typingsSlinky.joi.joiStrings.Rules with TopLevel[js.Any])
    ): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetup: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(
      value: js.ThisFunction4[
          /* this */ ExtensionBoundSchema, 
          /* params */ P, 
          /* value */ js.Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          _
        ]
    ): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

