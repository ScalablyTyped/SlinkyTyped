package typingsSlinky.fridaGum.Java

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassSpec extends js.Object {
  /**
    * Name and type of each field to expose.
    */
  var fields: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Interfaces implemented by this class.
    */
  var implements: js.UndefOr[js.Array[typingsSlinky.fridaGum.anon.Wrapper]] = js.native
  /**
    * Methods to implement. Use the special name `$init` to define one or more constructors.
    */
  var methods: js.UndefOr[
    StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]]
  ] = js.native
  /**
    * Name of the class.
    */
  var name: String = js.native
  /**
    * Super-class. Omit to inherit from `java.lang.Object`.
    */
  var superClass: js.UndefOr[typingsSlinky.fridaGum.anon.Wrapper] = js.native
}

object ClassSpec {
  @scala.inline
  def apply(name: String): ClassSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSpec]
  }
  @scala.inline
  implicit class ClassSpecOps[Self <: ClassSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withImplements(value: js.Array[typingsSlinky.fridaGum.anon.Wrapper]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implements")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperClass(value: typingsSlinky.fridaGum.anon.Wrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superClass")(js.undefined)
        ret
    }
  }
  
}

