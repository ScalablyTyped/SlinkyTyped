package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All fields defined in a permission are ANDed.
  */
@js.native
trait SchemaPermission extends js.Object {
  /**
    * Extra custom constraints. The constraints are ANDed together.
    */
  var constraints: js.UndefOr[js.Array[SchemaPermissionConstraint]] = js.native
  /**
    * Used in Ingress or Egress Gateway cases to specify hosts that the policy
    * applies to. Exact match, prefix match, and suffix match are supported.
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * HTTP method.
    */
  var methods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of hosts. Specifies exclusions.
    */
  var notHosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of methods. Specifies exclusions.
    */
  var notMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of paths. Specifies exclusions.
    */
  var notPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of ports. Specifies exclusions.
    */
  var notPorts: js.UndefOr[js.Array[String]] = js.native
  /**
    * HTTP request paths or gRPC methods. Exact match, prefix match, and suffix
    * match are supported.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Port names or numbers.
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPermission {
  @scala.inline
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  @scala.inline
  implicit class SchemaPermissionOps[Self <: SchemaPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: js.Array[SchemaPermissionConstraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[String]): Self = {
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
    def withNotHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withNotMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withNotPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withNotPorts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
  }
  
}

