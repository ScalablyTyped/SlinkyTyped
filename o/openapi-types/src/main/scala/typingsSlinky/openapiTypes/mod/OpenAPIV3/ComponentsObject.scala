package typingsSlinky.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentsObject extends js.Object {
  var callbacks: js.UndefOr[StringDictionary[ReferenceObject | CallbackObject]] = js.native
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.native
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.native
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.native
  var parameters: js.UndefOr[StringDictionary[ReferenceObject | ParameterObject]] = js.native
  var requestBodies: js.UndefOr[StringDictionary[ReferenceObject | RequestBodyObject]] = js.native
  var responses: js.UndefOr[StringDictionary[ReferenceObject | ResponseObject]] = js.native
  var schemas: js.UndefOr[StringDictionary[ReferenceObject | SchemaObject]] = js.native
  var securitySchemes: js.UndefOr[StringDictionary[ReferenceObject | SecuritySchemeObject]] = js.native
}

object ComponentsObject {
  @scala.inline
  def apply(): ComponentsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsObject]
  }
  @scala.inline
  implicit class ComponentsObjectOps[Self <: ComponentsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbacks(value: StringDictionary[ReferenceObject | CallbackObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withExamples(value: StringDictionary[ReferenceObject | ExampleObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[ReferenceObject | HeaderObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: StringDictionary[ReferenceObject | LinkObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[ReferenceObject | ParameterObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBodies(value: StringDictionary[ReferenceObject | RequestBodyObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBodies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBodies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBodies")(js.undefined)
        ret
    }
    @scala.inline
    def withResponses(value: StringDictionary[ReferenceObject | ResponseObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: StringDictionary[ReferenceObject | SchemaObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
    @scala.inline
    def withSecuritySchemes(value: StringDictionary[ReferenceObject | SecuritySchemeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securitySchemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecuritySchemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securitySchemes")(js.undefined)
        ret
    }
  }
  
}

