package typingsSlinky.breeze.anon

import typingsSlinky.breeze.breeze.EntityQuery
import typingsSlinky.breeze.breeze.HttpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityManager extends js.Object {
  var entityManager: typingsSlinky.breeze.breeze.EntityManager = js.native
  var httpResponse: HttpResponse = js.native
  var message: js.UndefOr[String] = js.native
  var query: EntityQuery = js.native
  var stack: js.UndefOr[String] = js.native
}

object EntityManager {
  @scala.inline
  def apply(
    entityManager: typingsSlinky.breeze.breeze.EntityManager,
    httpResponse: HttpResponse,
    query: EntityQuery
  ): EntityManager = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityManager]
  }
  @scala.inline
  implicit class EntityManagerOps[Self <: EntityManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityManager(value: typingsSlinky.breeze.breeze.EntityManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpResponse(value: HttpResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: EntityQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
  }
  
}

