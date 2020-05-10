package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adapts a secret into a projected volume.
  *
  * The contents of the target Secret's Data field will be presented in a projected volume as
  * files using the keys in the Data field as the file names. Note that this is identical to a
  * secret volume source without the default mode.
  */
@js.native
trait SecretProjection extends js.Object {
  /**
    * If unspecified, each key-value pair in the Data field of the referenced Secret will be
    * projected into the volume as a file whose name is the key and content is the value. If
    * specified, the listed keys will be projected into the specified paths, and unlisted keys
    * will not be present. If a key is specified which is not present in the Secret, the volume
    * setup will error unless it is marked optional. Paths must be relative and may not contain
    * the '..' path or start with '..'.
    */
  val items: js.Array[KeyToPath] = js.native
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String = js.native
  /**
    * Specify whether the Secret or its key must be defined
    */
  val optional: Boolean = js.native
}

object SecretProjection {
  @scala.inline
  def apply(items: js.Array[KeyToPath], name: String, optional: Boolean): SecretProjection = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretProjection]
  }
  @scala.inline
  implicit class SecretProjectionOps[Self <: SecretProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[KeyToPath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

