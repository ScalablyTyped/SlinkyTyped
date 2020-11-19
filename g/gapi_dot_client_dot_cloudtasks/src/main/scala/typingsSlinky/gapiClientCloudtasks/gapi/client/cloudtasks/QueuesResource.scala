package typingsSlinky.gapiClientCloudtasks.gapi.client.cloudtasks

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudtasks.anon.Accesstoken
import typingsSlinky.gapiClientCloudtasks.anon.Alt
import typingsSlinky.gapiClientCloudtasks.anon.Fields
import typingsSlinky.gapiClientCloudtasks.anon.Filter
import typingsSlinky.gapiClientCloudtasks.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueuesResource extends js.Object {
  
  /**
    * Creates a queue.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def create(request: Alt): Request[Queue] = js.native
  
  /**
    * Deletes a queue.
    *
    * This command will delete the queue even if it has tasks in it.
    *
    * Note: If you delete a queue, a queue with the same name can't be created
    * for 7 days.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets a queue. */
  def get(request: Accesstoken): Request[Queue] = js.native
  
  /**
    * Gets the access control policy for a Queue.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    *
    * Authorization requires the following [Google IAM](/iam) permission on the
    * specified resource parent:
    *
    * &#42; `cloudtasks.queues.getIamPolicy`
    */
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    */
  def list(request: Filter): Request[ListQueuesResponse] = js.native
  
  /**
    * Updates a queue.
    *
    * This method creates the queue if it does not exist and updates
    * the queue if it does exist.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def patch(request: Key): Request[Queue] = js.native
  
  /**
    * Pauses the queue.
    *
    * If a queue is paused then the system will stop executing the
    * tasks in the queue until it is resumed via
    * CloudTasks.ResumeQueue. Tasks can still be added when the
    * queue is paused. The state of the queue is stored in
    * Queue.queue_state; if paused it will be set to
    * Queue.QueueState.PAUSED.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def pause(request: Accesstoken): Request[Queue] = js.native
  
  /**
    * Purges a queue by deleting all of its tasks.
    *
    * All tasks created before this method is called are permanently deleted.
    *
    * Purge operations can take up to one minute to take effect. Tasks
    * might be dispatched before the purge takes effect. A purge is irreversible.
    */
  def purge(request: Accesstoken): Request[Queue] = js.native
  
  /**
    * Resume a queue.
    *
    * This method resumes a queue after it has been
    * Queue.QueueState.PAUSED or Queue.QueueState.DISABLED. The state of
    * a queue is stored in Queue.queue_state; after calling this method it
    * will be set to Queue.QueueState.RUNNING.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    *
    * WARNING: Resuming many high-QPS queues at the same time can
    * lead to target overloading. If you are resuming high-QPS
    * queues, follow the 500/50/5 pattern described in
    * [Managing Cloud Tasks Scaling Risks](/cloud-tasks/pdfs/managing-cloud-tasks-scaling-risks-2017-06-05.pdf).
    */
  def resume(request: Accesstoken): Request[Queue] = js.native
  
  /**
    * Sets the access control policy for a Queue. Replaces any existing
    * policy.
    *
    * Authorization requires the following [Google IAM](/iam) permission on the
    * specified resource parent:
    *
    * &#42; `cloudtasks.queues.setIamPolicy`
    */
  def setIamPolicy(request: Fields): Request[Policy] = js.native
  
  var tasks: TasksResource = js.native
  
  /**
    * Returns permissions that a caller has on a Queue.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a google.rpc.Code.NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Fields): Request[TestIamPermissionsResponse] = js.native
}
object QueuesResource {
  
  @scala.inline
  def apply(
    create: Alt => Request[Queue],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[Queue],
    getIamPolicy: Fields => Request[Policy],
    list: Filter => Request[ListQueuesResponse],
    patch: Key => Request[Queue],
    pause: Accesstoken => Request[Queue],
    purge: Accesstoken => Request[Queue],
    resume: Accesstoken => Request[Queue],
    setIamPolicy: Fields => Request[Policy],
    tasks: TasksResource,
    testIamPermissions: Fields => Request[TestIamPermissionsResponse]
  ): QueuesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), pause = js.Any.fromFunction1(pause), purge = js.Any.fromFunction1(purge), resume = js.Any.fromFunction1(resume), setIamPolicy = js.Any.fromFunction1(setIamPolicy), tasks = tasks.asInstanceOf[js.Any], testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[QueuesResource]
  }
  
  @scala.inline
  implicit class QueuesResourceOps[Self <: QueuesResource] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: Alt => Request[Queue]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: Accesstoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: Accesstoken => Request[Queue]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIamPolicy(value: Fields => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Filter => Request[ListQueuesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(value: Key => Request[Queue]): Self = this.set("patch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPause(value: Accesstoken => Request[Queue]): Self = this.set("pause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPurge(value: Accesstoken => Request[Queue]): Self = this.set("purge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResume(value: Accesstoken => Request[Queue]): Self = this.set("resume", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIamPolicy(value: Fields => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTasks(value: TasksResource): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIamPermissions(value: Fields => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
  }
}
