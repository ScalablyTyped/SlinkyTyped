package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLastAccessed extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticated: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticatedEntity: js.UndefOr[arnType] = js.native
  /**
    * The name of the service in which access was attempted.
    */
  var ServiceName: serviceNameType = js.native
  /**
    * The namespace of the service in which access was attempted. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: serviceNamespaceType = js.native
  /**
    * The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to access the service. This field is null if no principals attempted to access the service within the reporting period.
    */
  var TotalAuthenticatedEntities: js.UndefOr[integerType] = js.native
}

object ServiceLastAccessed {
  @scala.inline
  def apply(ServiceName: serviceNameType, ServiceNamespace: serviceNamespaceType): ServiceLastAccessed = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLastAccessed]
  }
  @scala.inline
  implicit class ServiceLastAccessedOps[Self <: ServiceLastAccessed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceName(value: serviceNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceNamespace(value: serviceNamespaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAuthenticated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAuthenticated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAuthenticated")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAuthenticatedEntity(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAuthenticatedEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAuthenticatedEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAuthenticatedEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalAuthenticatedEntities(value: integerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAuthenticatedEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalAuthenticatedEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAuthenticatedEntities")(js.undefined)
        ret
    }
  }
  
}

