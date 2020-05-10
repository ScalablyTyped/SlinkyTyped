package typingsSlinky.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The same asset can be represented in different formats, for example, a
  * [WaveFront .obj](//en.wikipedia.org/wiki/Wavefront_.obj_file) file with its
  * corresponding .mtl file or a [Khronos glTF](//www.khronos.org/gltf) file
  * with its corresponding .glb binary data. A format refers to a specific
  * representation of an asset and contains all information needed to retrieve
  * and describe this representation.
  */
@js.native
trait SchemaFormat extends js.Object {
  /**
    * Complexity stats about this representation of the asset.
    */
  var formatComplexity: js.UndefOr[SchemaFormatComplexity] = js.native
  /**
    * A short string that identifies the format type of this representation.
    * Possible values are: `FBX`, `GLTF`, `GLTF2`, `OBJ`, and `TILT`.
    */
  var formatType: js.UndefOr[String] = js.native
  /**
    * A list of dependencies of the root element. May include, but is not
    * limited to, materials, textures, and shader programs.
    */
  var resources: js.UndefOr[js.Array[SchemaFile]] = js.native
  /**
    * The root of the file hierarchy. This will always be populated. For some
    * format_types - such as `TILT`, which are self-contained - this is all of
    * the data.  Other types - such as `OBJ` - often reference other data
    * elements. These are contained in the resources field.
    */
  var root: js.UndefOr[SchemaFile] = js.native
}

object SchemaFormat {
  @scala.inline
  def apply(): SchemaFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormat]
  }
  @scala.inline
  implicit class SchemaFormatOps[Self <: SchemaFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatComplexity(value: SchemaFormatComplexity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatComplexity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatComplexity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatComplexity")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatType")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[SchemaFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: SchemaFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

