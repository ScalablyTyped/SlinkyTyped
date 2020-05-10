package typingsSlinky.googleapisCommon.schemaMod

import typingsSlinky.googleapisCommon.AnonOauth2
import typingsSlinky.googleapisCommon.AnonX16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  var auth: AnonOauth2 = js.native
  var basePath: String = js.native
  var baseUrl: String = js.native
  var batchPath: String = js.native
  var description: String = js.native
  var discoveryRestUrl: String = js.native
  var discoveryVersion: String = js.native
  var documentationLink: String = js.native
  var etag: String = js.native
  var icons: AnonX16 = js.native
  var id: String = js.native
  var kind: String = js.native
  var methods: SchemaMethods = js.native
  var name: String = js.native
  var ownerDomain: String = js.native
  var ownerName: String = js.native
  var parameters: SchemaParameters = js.native
  var protocol: String = js.native
  var resources: SchemaResources = js.native
  var revision: String = js.native
  var rootUrl: String = js.native
  var schemas: SchemaItems = js.native
  var servicePath: String = js.native
  var title: String = js.native
  var version: String = js.native
}

object Schema {
  @scala.inline
  def apply(
    auth: AnonOauth2,
    basePath: String,
    baseUrl: String,
    batchPath: String,
    description: String,
    discoveryRestUrl: String,
    discoveryVersion: String,
    documentationLink: String,
    etag: String,
    icons: AnonX16,
    id: String,
    kind: String,
    methods: SchemaMethods,
    name: String,
    ownerDomain: String,
    ownerName: String,
    parameters: SchemaParameters,
    protocol: String,
    resources: SchemaResources,
    revision: String,
    rootUrl: String,
    schemas: SchemaItems,
    servicePath: String,
    title: String,
    version: String
  ): Schema = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], batchPath = batchPath.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], discoveryRestUrl = discoveryRestUrl.asInstanceOf[js.Any], discoveryVersion = discoveryVersion.asInstanceOf[js.Any], documentationLink = documentationLink.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerDomain = ownerDomain.asInstanceOf[js.Any], ownerName = ownerName.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], rootUrl = rootUrl.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], servicePath = servicePath.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: AnonOauth2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscoveryRestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryRestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscoveryVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentationLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcons(value: AnonX16): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethods(value: SchemaMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: SchemaParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: SchemaResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemas(value: SchemaItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServicePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

