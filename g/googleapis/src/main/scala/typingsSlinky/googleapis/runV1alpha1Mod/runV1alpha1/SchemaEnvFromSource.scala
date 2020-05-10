package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
@js.native
trait SchemaEnvFromSource extends js.Object {
  /**
    * The ConfigMap to select from +optional
    */
  var configMapRef: js.UndefOr[SchemaConfigMapEnvSource] = js.native
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a
    * C_IDENTIFIER. +optional
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * The Secret to select from +optional
    */
  var secretRef: js.UndefOr[SchemaSecretEnvSource] = js.native
}

object SchemaEnvFromSource {
  @scala.inline
  def apply(): SchemaEnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvFromSource]
  }
  @scala.inline
  implicit class SchemaEnvFromSourceOps[Self <: SchemaEnvFromSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigMapRef(value: SchemaConfigMapEnvSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMapRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigMapRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMapRef")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretRef(value: SchemaSecretEnvSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(js.undefined)
        ret
    }
  }
  
}

