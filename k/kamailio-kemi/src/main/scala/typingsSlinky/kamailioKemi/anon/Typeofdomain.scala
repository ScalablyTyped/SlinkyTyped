package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdomain extends js.Object {
  def is_domain_local(sdomain: String): Double = js.native
  def is_from_local(): Double = js.native
  def is_uri_host_local(): Double = js.native
  def lookup_domain(_sdomain: String): Double = js.native
  def lookup_domain_prefix(_sdomain: String, _sprefix: String): Double = js.native
}

object Typeofdomain {
  @scala.inline
  def apply(
    is_domain_local: String => Double,
    is_from_local: () => Double,
    is_uri_host_local: () => Double,
    lookup_domain: String => Double,
    lookup_domain_prefix: (String, String) => Double
  ): Typeofdomain = {
    val __obj = js.Dynamic.literal(is_domain_local = js.Any.fromFunction1(is_domain_local), is_from_local = js.Any.fromFunction0(is_from_local), is_uri_host_local = js.Any.fromFunction0(is_uri_host_local), lookup_domain = js.Any.fromFunction1(lookup_domain), lookup_domain_prefix = js.Any.fromFunction2(lookup_domain_prefix))
    __obj.asInstanceOf[Typeofdomain]
  }
  @scala.inline
  implicit class TypeofdomainOps[Self <: Typeofdomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_domain_local(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_domain_local")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_from_local(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_from_local")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs_uri_host_local(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_uri_host_local")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLookup_domain(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup_domain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLookup_domain_prefix(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup_domain_prefix")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

