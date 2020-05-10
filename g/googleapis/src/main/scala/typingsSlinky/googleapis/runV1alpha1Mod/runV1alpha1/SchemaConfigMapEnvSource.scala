package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMapEnvSource selects a ConfigMap to populate the environment
  * variables with.  The contents of the target ConfigMap&#39;s Data field will
  * represent the key-value pairs as environment variables.
  */
@js.native
trait SchemaConfigMapEnvSource extends js.Object {
  /**
    * The ConfigMap to select from.
    */
  var localObjectReference: js.UndefOr[SchemaLocalObjectReference] = js.native
  /**
    * Specify whether the ConfigMap must be defined +optional
    */
  var optional: js.UndefOr[Boolean] = js.native
}

object SchemaConfigMapEnvSource {
  @scala.inline
  def apply(): SchemaConfigMapEnvSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigMapEnvSource]
  }
  @scala.inline
  implicit class SchemaConfigMapEnvSourceOps[Self <: SchemaConfigMapEnvSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalObjectReference(value: SchemaLocalObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localObjectReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalObjectReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localObjectReference")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
  }
  
}

