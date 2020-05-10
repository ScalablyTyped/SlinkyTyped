package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not
  * support ownership management or SELinux relabeling.
  */
@js.native
trait GlusterfsPersistentVolumeSource extends js.Object {
  /**
    * EndpointsName is the endpoint name that details Glusterfs topology. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  val endpoints: String = js.native
  /**
    * EndpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is
    * empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  val endpointsNamespace: String = js.native
  /**
    * Path is the Glusterfs volume path. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  val path: String = js.native
  /**
    * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
    * Defaults to false. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  val readOnly: Boolean = js.native
}

object GlusterfsPersistentVolumeSource {
  @scala.inline
  def apply(endpoints: String, endpointsNamespace: String, path: String, readOnly: Boolean): GlusterfsPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], endpointsNamespace = endpointsNamespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlusterfsPersistentVolumeSource]
  }
  @scala.inline
  implicit class GlusterfsPersistentVolumeSourceOps[Self <: GlusterfsPersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointsNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointsNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

