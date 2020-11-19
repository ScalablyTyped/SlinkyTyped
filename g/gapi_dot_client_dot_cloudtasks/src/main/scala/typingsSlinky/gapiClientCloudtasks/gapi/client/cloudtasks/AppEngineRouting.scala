package typingsSlinky.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppEngineRouting extends js.Object {
  
  /**
    * Output only.
    *
    * The host that the task is sent to. For more information, see
    * [How Requests are Routed](/appengine/docs/standard/python/how-requests-are-routed).
    *
    * The host is constructed as:
    *
    *
    * &#42; `host = [application_domain_name]`</br>
    * `| [service] + '.' + [application_domain_name]`</br>
    * `| [version] + '.' + [application_domain_name]`</br>
    * `| [version_dot_service]+ '.' + [application_domain_name]`</br>
    * `| [instance] + '.' + [application_domain_name]`</br>
    * `| [instance_dot_service] + '.' + [application_domain_name]`</br>
    * `| [instance_dot_version] + '.' + [application_domain_name]`</br>
    * `| [instance_dot_version_dot_service] + '.' + [application_domain_name]`
    *
    * &#42; `application_domain_name` = The domain name of the app, for
    * example <app-id>.appspot.com, which is associated with the
    * queue's project ID. Some tasks which were created using the App Engine
    * SDK use a custom domain name.
    *
    * &#42; `service =` AppEngineRouting.service
    *
    * &#42; `version =` AppEngineRouting.version
    *
    * &#42; `version_dot_service =`
    * AppEngineRouting.version `+ '.' +` AppEngineRouting.service
    *
    * &#42; `instance =` AppEngineRouting.instance
    *
    * &#42; `instance_dot_service =`
    * AppEngineRouting.instance `+ '.' +` AppEngineRouting.service
    *
    * &#42; `instance_dot_version =`
    * AppEngineRouting.instance `+ '.' +` AppEngineRouting.version
    *
    * &#42; `instance_dot_version_dot_service =`
    * AppEngineRouting.instance `+ '.' +`
    * AppEngineRouting.version `+ '.' +` AppEngineRouting.service
    *
    * If AppEngineRouting.service is empty, then the task will be sent
    * to the service which is the default service when the task is attempted.
    *
    * If AppEngineRouting.version is empty, then the task will be sent
    * to the version which is the default version when the task is attempted.
    *
    * If AppEngineRouting.instance is empty, then the task will be sent
    * to an instance which is available when the task is attempted.
    *
    * When AppEngineRouting.service is "default",
    * AppEngineRouting.version is "default", and
    * AppEngineRouting.instance is empty, AppEngineRouting.host is
    * shortened to just the `application_domain_name`.
    *
    * If AppEngineRouting.service, AppEngineRouting.version, or
    * AppEngineRouting.instance is invalid, then the task will be sent
    * to the default version of the default service when the task is attempted.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * App instance.
    *
    * By default, the task is sent to an instance which is available when
    * the task is attempted.
    *
    * Requests can only be sent to a specific instance if
    * [manual scaling is used in App Engine Standard](/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes).
    * App Engine Flex does not support instances. For more information, see
    * [App Engine Standard request routing](/appengine/docs/standard/python/how-requests-are-routed)
    * and [App Engine Flex request routing](/appengine/docs/flexible/python/how-requests-are-routed).
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * App service.
    *
    * By default, the task is sent to the service which is the default
    * service when the task is attempted ("default").
    *
    * For some queues or tasks which were created using the App Engine Task Queue
    * API, AppEngineRouting.host is not parsable into
    * AppEngineRouting.service, AppEngineRouting.version, and
    * AppEngineRouting.instance. For example, some tasks which were created
    * using the App Engine SDK use a custom domain name; custom domains are not
    * parsed by Cloud Tasks. If AppEngineRouting.host is not parsable, then
    * AppEngineRouting.service, AppEngineRouting.version, and
    * AppEngineRouting.instance are the empty string.
    */
  var service: js.UndefOr[String] = js.native
  
  /**
    * App version.
    *
    * By default, the task is sent to the version which is the default
    * version when the task is attempted ("default").
    *
    * For some queues or tasks which were created using the App Engine Task Queue
    * API, AppEngineRouting.host is not parsable into
    * AppEngineRouting.service, AppEngineRouting.version, and
    * AppEngineRouting.instance. For example, some tasks which were created
    * using the App Engine SDK use a custom domain name; custom domains are not
    * parsed by Cloud Tasks. If AppEngineRouting.host is not parsable, then
    * AppEngineRouting.service, AppEngineRouting.version, and
    * AppEngineRouting.instance are the empty string.
    */
  var version: js.UndefOr[String] = js.native
}
object AppEngineRouting {
  
  @scala.inline
  def apply(): AppEngineRouting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineRouting]
  }
  
  @scala.inline
  implicit class AppEngineRoutingOps[Self <: AppEngineRouting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
