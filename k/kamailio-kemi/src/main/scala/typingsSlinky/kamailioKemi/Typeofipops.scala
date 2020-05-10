package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofipops extends js.Object {
  def compare_ips(_sval1: String, _sval2: String): Double = js.native
  def compare_pure_ips(_sval1: String, _sval2: String): Double = js.native
  def detailed_ip_type(_sval: String, _dpv: String): Double = js.native
  def detailed_ipv4_type(_sval: String, _dpv: String): Double = js.native
  def detailed_ipv6_type(_sval: String, _dpv: String): Double = js.native
  def dns_int_match_ip(vhn: String, vip: String): Double = js.native
  def dns_query(naptrname: String, pvid: String): Double = js.native
  def dns_sys_match_ip(vhn: String, vip: String): Double = js.native
  def ip_is_in_subnet(_sval1: String, _sval2: String): Double = js.native
  def ip_type(sval: String): Double = js.native
  def is_in_subnet(_sval1: String, _sval2: String): Double = js.native
  def is_ip(sval: String): Double = js.native
  def is_ip4(sval: String): Double = js.native
  def is_ip6(sval: String): Double = js.native
  def is_ip6_reference(sval: String): Double = js.native
  def is_ip_rfc1918(sval: String): Double = js.native
  def is_pure_ip(sval: String): Double = js.native
  def naptr_query(naptrname: String, pvid: String): Double = js.native
  def srv_query(naptrname: String, pvid: String): Double = js.native
}

object Typeofipops {
  @scala.inline
  def apply(
    compare_ips: (String, String) => Double,
    compare_pure_ips: (String, String) => Double,
    detailed_ip_type: (String, String) => Double,
    detailed_ipv4_type: (String, String) => Double,
    detailed_ipv6_type: (String, String) => Double,
    dns_int_match_ip: (String, String) => Double,
    dns_query: (String, String) => Double,
    dns_sys_match_ip: (String, String) => Double,
    ip_is_in_subnet: (String, String) => Double,
    ip_type: String => Double,
    is_in_subnet: (String, String) => Double,
    is_ip: String => Double,
    is_ip4: String => Double,
    is_ip6: String => Double,
    is_ip6_reference: String => Double,
    is_ip_rfc1918: String => Double,
    is_pure_ip: String => Double,
    naptr_query: (String, String) => Double,
    srv_query: (String, String) => Double
  ): Typeofipops = {
    val __obj = js.Dynamic.literal(compare_ips = js.Any.fromFunction2(compare_ips), compare_pure_ips = js.Any.fromFunction2(compare_pure_ips), detailed_ip_type = js.Any.fromFunction2(detailed_ip_type), detailed_ipv4_type = js.Any.fromFunction2(detailed_ipv4_type), detailed_ipv6_type = js.Any.fromFunction2(detailed_ipv6_type), dns_int_match_ip = js.Any.fromFunction2(dns_int_match_ip), dns_query = js.Any.fromFunction2(dns_query), dns_sys_match_ip = js.Any.fromFunction2(dns_sys_match_ip), ip_is_in_subnet = js.Any.fromFunction2(ip_is_in_subnet), ip_type = js.Any.fromFunction1(ip_type), is_in_subnet = js.Any.fromFunction2(is_in_subnet), is_ip = js.Any.fromFunction1(is_ip), is_ip4 = js.Any.fromFunction1(is_ip4), is_ip6 = js.Any.fromFunction1(is_ip6), is_ip6_reference = js.Any.fromFunction1(is_ip6_reference), is_ip_rfc1918 = js.Any.fromFunction1(is_ip_rfc1918), is_pure_ip = js.Any.fromFunction1(is_pure_ip), naptr_query = js.Any.fromFunction2(naptr_query), srv_query = js.Any.fromFunction2(srv_query))
    __obj.asInstanceOf[Typeofipops]
  }
  @scala.inline
  implicit class TypeofipopsOps[Self <: Typeofipops] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompare_ips(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare_ips")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompare_pure_ips(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare_pure_ips")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDetailed_ip_type(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed_ip_type")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDetailed_ipv4_type(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed_ipv4_type")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDetailed_ipv6_type(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed_ipv6_type")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDns_int_match_ip(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dns_int_match_ip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDns_query(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dns_query")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDns_sys_match_ip(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dns_sys_match_ip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIp_is_in_subnet(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_is_in_subnet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIp_type(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_type")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_in_subnet(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_in_subnet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIs_ip(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_ip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_ip4(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_ip4")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_ip6(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_ip6")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_ip6_reference(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_ip6_reference")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_ip_rfc1918(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_ip_rfc1918")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_pure_ip(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_pure_ip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNaptr_query(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naptr_query")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSrv_query(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srv_query")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

