package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sarif.mod.Artifact.roles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact_ extends js.Object {
  /**
    * The contents of the artifact.
    */
  var contents: js.UndefOr[ArtifactContent] = js.native
  /**
    * A short description of the artifact.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * Specifies the encoding for an artifact object that refers to a text file.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of
    * the artifact produced by the specified hash function.
    */
  var hashes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastModifiedTimeUtc: js.UndefOr[String] = js.native
  /**
    * The length of the artifact in bytes.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The location of the artifact.
    */
  var location: js.UndefOr[ArtifactLocation] = js.native
  /**
    * The MIME type (RFC 2045) of the artifact.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The offset in bytes of the artifact within its containing artifact.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Identifies the index of the immediate parent of the artifact, if this artifact is nested.
    */
  var parentIndex: js.UndefOr[Double] = js.native
  /**
    * Key/value pairs that provide additional information about the artifact.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The role or roles played by the artifact in the analysis.
    */
  var roles: js.UndefOr[js.Array[roles]] = js.native
  /**
    * Specifies the source language for any artifact object that refers to a text file that contains source code.
    */
  var sourceLanguage: js.UndefOr[String] = js.native
}

object Artifact_ {
  @scala.inline
  def apply(): Artifact_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact_]
  }
  @scala.inline
  implicit class Artifact_Ops[Self <: Artifact_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: ArtifactContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withHashes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashes")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTimeUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTimeUtc")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withParentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: js.Array[roles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLanguage")(js.undefined)
        ret
    }
  }
  
}

