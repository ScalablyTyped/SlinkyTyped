package typingsSlinky.chromeDashApps.chrome.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ISO language code such as en or fr.
  * For a complete list of languages supported by this method, see kLanguageInfoTable.
  * For an unknown language, und will be returned,
  * which means that [percentage] of the text is unknown to CLD
  * @since Chrome 47.
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.und
  - typings.chromeDashApps.chromeDashAppsStrings.af
  - typings.chromeDashApps.chromeDashAppsStrings.am
  - typings.chromeDashApps.chromeDashAppsStrings.an
  - typings.chromeDashApps.chromeDashAppsStrings.ar
  - typings.chromeDashApps.chromeDashAppsStrings.ast
  - typings.chromeDashApps.chromeDashAppsStrings.az
  - typings.chromeDashApps.chromeDashAppsStrings.be
  - typings.chromeDashApps.chromeDashAppsStrings.bg
  - typings.chromeDashApps.chromeDashAppsStrings.bh
  - typings.chromeDashApps.chromeDashAppsStrings.bn
  - typings.chromeDashApps.chromeDashAppsStrings.br
  - typings.chromeDashApps.chromeDashAppsStrings.bs
  - typings.chromeDashApps.chromeDashAppsStrings.ca
  - typings.chromeDashApps.chromeDashAppsStrings.ceb
  - typings.chromeDashApps.chromeDashAppsStrings.ckb
  - typings.chromeDashApps.chromeDashAppsStrings.co
  - typings.chromeDashApps.chromeDashAppsStrings.cs
  - typings.chromeDashApps.chromeDashAppsStrings.cy
  - typings.chromeDashApps.chromeDashAppsStrings.da
  - typings.chromeDashApps.chromeDashAppsStrings.de
  - typings.chromeDashApps.chromeDashAppsStrings.`de-AT`
  - typings.chromeDashApps.chromeDashAppsStrings.`de-CH`
  - typings.chromeDashApps.chromeDashAppsStrings.`de-DE`
  - typings.chromeDashApps.chromeDashAppsStrings.`de-LI`
  - typings.chromeDashApps.chromeDashAppsStrings.el
  - typings.chromeDashApps.chromeDashAppsStrings.en
  - typings.chromeDashApps.chromeDashAppsStrings.`en-AU`
  - typings.chromeDashApps.chromeDashAppsStrings.`en-CA`
  - typings.chromeDashApps.chromeDashAppsStrings.`en-GB`
  - typings.chromeDashApps.chromeDashAppsStrings.`en-IN`
  - typings.chromeDashApps.chromeDashAppsStrings.`en-NZ`
  - typings.chromeDashApps.chromeDashAppsStrings.`en-US`
  - typings.chromeDashApps.chromeDashAppsStrings.`en-ZA`
  - typings.chromeDashApps.chromeDashAppsStrings.eo
  - typings.chromeDashApps.chromeDashAppsStrings.es
  - typings.chromeDashApps.chromeDashAppsStrings.`es-419`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-AR`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-CL`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-CO`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-CR`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-ES`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-HN`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-MX`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-PE`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-US`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-UY`
  - typings.chromeDashApps.chromeDashAppsStrings.`es-VE`
  - typings.chromeDashApps.chromeDashAppsStrings.et
  - typings.chromeDashApps.chromeDashAppsStrings.eu
  - typings.chromeDashApps.chromeDashAppsStrings.fa
  - typings.chromeDashApps.chromeDashAppsStrings.fi
  - typings.chromeDashApps.chromeDashAppsStrings.fil
  - typings.chromeDashApps.chromeDashAppsStrings.fo
  - typings.chromeDashApps.chromeDashAppsStrings.fr
  - typings.chromeDashApps.chromeDashAppsStrings.`fr-CA`
  - typings.chromeDashApps.chromeDashAppsStrings.`fr-CH`
  - typings.chromeDashApps.chromeDashAppsStrings.`fr-FR`
  - typings.chromeDashApps.chromeDashAppsStrings.fy
  - typings.chromeDashApps.chromeDashAppsStrings.ga
  - typings.chromeDashApps.chromeDashAppsStrings.gd
  - typings.chromeDashApps.chromeDashAppsStrings.gl
  - typings.chromeDashApps.chromeDashAppsStrings.gn
  - typings.chromeDashApps.chromeDashAppsStrings.gu
  - typings.chromeDashApps.chromeDashAppsStrings.ha
  - typings.chromeDashApps.chromeDashAppsStrings.haw
  - typings.chromeDashApps.chromeDashAppsStrings.he
  - typings.chromeDashApps.chromeDashAppsStrings.hi
  - typings.chromeDashApps.chromeDashAppsStrings.hmn
  - typings.chromeDashApps.chromeDashAppsStrings.hr
  - typings.chromeDashApps.chromeDashAppsStrings.ht
  - typings.chromeDashApps.chromeDashAppsStrings.hu
  - typings.chromeDashApps.chromeDashAppsStrings.hy
  - typings.chromeDashApps.chromeDashAppsStrings.ia
  - typings.chromeDashApps.chromeDashAppsStrings.id
  - typings.chromeDashApps.chromeDashAppsStrings.ig
  - typings.chromeDashApps.chromeDashAppsStrings.is
  - typings.chromeDashApps.chromeDashAppsStrings.it
  - typings.chromeDashApps.chromeDashAppsStrings.`it-CH`
  - typings.chromeDashApps.chromeDashAppsStrings.`it-IT`
  - typings.chromeDashApps.chromeDashAppsStrings.ja
  - typings.chromeDashApps.chromeDashAppsStrings.jv
  - typings.chromeDashApps.chromeDashAppsStrings.ka
  - typings.chromeDashApps.chromeDashAppsStrings.kk
  - typings.chromeDashApps.chromeDashAppsStrings.km
  - typings.chromeDashApps.chromeDashAppsStrings.kn
  - typings.chromeDashApps.chromeDashAppsStrings.ko
  - typings.chromeDashApps.chromeDashAppsStrings.ku
  - typings.chromeDashApps.chromeDashAppsStrings.ky
  - typings.chromeDashApps.chromeDashAppsStrings.la
  - typings.chromeDashApps.chromeDashAppsStrings.lb
  - typings.chromeDashApps.chromeDashAppsStrings.ln
  - typings.chromeDashApps.chromeDashAppsStrings.lo
  - typings.chromeDashApps.chromeDashAppsStrings.lt
  - typings.chromeDashApps.chromeDashAppsStrings.lv
  - typings.chromeDashApps.chromeDashAppsStrings.mg
  - typings.chromeDashApps.chromeDashAppsStrings.mi
  - typings.chromeDashApps.chromeDashAppsStrings.mk
  - typings.chromeDashApps.chromeDashAppsStrings.ml
  - typings.chromeDashApps.chromeDashAppsStrings.mn
  - typings.chromeDashApps.chromeDashAppsStrings.mo
  - typings.chromeDashApps.chromeDashAppsStrings.mr
  - typings.chromeDashApps.chromeDashAppsStrings.ms
  - typings.chromeDashApps.chromeDashAppsStrings.mt
  - typings.chromeDashApps.chromeDashAppsStrings.my
  - typings.chromeDashApps.chromeDashAppsStrings.nb
  - typings.chromeDashApps.chromeDashAppsStrings.ne
  - typings.chromeDashApps.chromeDashAppsStrings.nl
  - typings.chromeDashApps.chromeDashAppsStrings.nn
  - typings.chromeDashApps.chromeDashAppsStrings.no
  - typings.chromeDashApps.chromeDashAppsStrings.ny
  - typings.chromeDashApps.chromeDashAppsStrings.oc
  - typings.chromeDashApps.chromeDashAppsStrings.om
  - typings.chromeDashApps.chromeDashAppsStrings.or
  - typings.chromeDashApps.chromeDashAppsStrings.pa
  - typings.chromeDashApps.chromeDashAppsStrings.pl
  - typings.chromeDashApps.chromeDashAppsStrings.ps
  - typings.chromeDashApps.chromeDashAppsStrings.pt
  - typings.chromeDashApps.chromeDashAppsStrings.`pt-BR`
  - typings.chromeDashApps.chromeDashAppsStrings.`pt-PT`
  - typings.chromeDashApps.chromeDashAppsStrings.qu
  - typings.chromeDashApps.chromeDashAppsStrings.rm
  - typings.chromeDashApps.chromeDashAppsStrings.ro
  - typings.chromeDashApps.chromeDashAppsStrings.ru
  - typings.chromeDashApps.chromeDashAppsStrings.sd
  - typings.chromeDashApps.chromeDashAppsStrings.sh
  - typings.chromeDashApps.chromeDashAppsStrings.si
  - typings.chromeDashApps.chromeDashAppsStrings.sk
  - typings.chromeDashApps.chromeDashAppsStrings.sl
  - typings.chromeDashApps.chromeDashAppsStrings.sm
  - typings.chromeDashApps.chromeDashAppsStrings.sn
  - typings.chromeDashApps.chromeDashAppsStrings.so
  - typings.chromeDashApps.chromeDashAppsStrings.sq
  - typings.chromeDashApps.chromeDashAppsStrings.sr
  - typings.chromeDashApps.chromeDashAppsStrings.st
  - typings.chromeDashApps.chromeDashAppsStrings.su
  - typings.chromeDashApps.chromeDashAppsStrings.sv
  - typings.chromeDashApps.chromeDashAppsStrings.sw
  - typings.chromeDashApps.chromeDashAppsStrings.ta
  - typings.chromeDashApps.chromeDashAppsStrings.te
  - typings.chromeDashApps.chromeDashAppsStrings.tg
  - typings.chromeDashApps.chromeDashAppsStrings.th
  - typings.chromeDashApps.chromeDashAppsStrings.ti
  - typings.chromeDashApps.chromeDashAppsStrings.tk
  - typings.chromeDashApps.chromeDashAppsStrings.to
  - typings.chromeDashApps.chromeDashAppsStrings.tr
  - typings.chromeDashApps.chromeDashAppsStrings.tt
  - typings.chromeDashApps.chromeDashAppsStrings.tw
  - typings.chromeDashApps.chromeDashAppsStrings.ug
  - typings.chromeDashApps.chromeDashAppsStrings.uk
  - typings.chromeDashApps.chromeDashAppsStrings.ur
  - typings.chromeDashApps.chromeDashAppsStrings.uz
  - typings.chromeDashApps.chromeDashAppsStrings.vi
  - typings.chromeDashApps.chromeDashAppsStrings.wa
  - typings.chromeDashApps.chromeDashAppsStrings.xh
  - typings.chromeDashApps.chromeDashAppsStrings.yi
  - typings.chromeDashApps.chromeDashAppsStrings.yo
  - typings.chromeDashApps.chromeDashAppsStrings.zh
  - typings.chromeDashApps.chromeDashAppsStrings.`zh-CN`
  - typings.chromeDashApps.chromeDashAppsStrings.`zh-HK`
  - typings.chromeDashApps.chromeDashAppsStrings.`zh-TW`
  - typings.chromeDashApps.chromeDashAppsStrings.zu
  - typings.chromeDashApps.chromeDashAppsStrings.ar_001
  - typings.chromeDashApps.chromeDashAppsStrings.en_001
  - typings.chromeDashApps.chromeDashAppsStrings.en_150
  - typings.chromeDashApps.chromeDashAppsStrings.zh_hans_cn
  - typings.chromeDashApps.chromeDashAppsStrings.zh_hant_hk
  - typings.chromeDashApps.chromeDashAppsStrings.zh_hant_mo
  - typings.chromeDashApps.chromeDashAppsStrings.zh_hans_sg
  - typings.chromeDashApps.chromeDashAppsStrings.zh_hant_tw
*/
trait LanguageCode extends js.Object

object LanguageCode {
  @scala.inline
  def af: typingsSlinky.chromeDashApps.chromeDashAppsStrings.af = this.cast("af")
  @scala.inline
  def am: typingsSlinky.chromeDashApps.chromeDashAppsStrings.am = this.cast("am")
  @scala.inline
  def an: typingsSlinky.chromeDashApps.chromeDashAppsStrings.an = this.cast("an")
  @scala.inline
  def ar: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ar = this.cast("ar")
  @scala.inline
  def ar_001: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ar_001 = this.cast("ar_001")
  @scala.inline
  def ast: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ast = this.cast("ast")
  @scala.inline
  def az: typingsSlinky.chromeDashApps.chromeDashAppsStrings.az = this.cast("az")
  @scala.inline
  def be: typingsSlinky.chromeDashApps.chromeDashAppsStrings.be = this.cast("be")
  @scala.inline
  def bg: typingsSlinky.chromeDashApps.chromeDashAppsStrings.bg = this.cast("bg")
  @scala.inline
  def bh: typingsSlinky.chromeDashApps.chromeDashAppsStrings.bh = this.cast("bh")
  @scala.inline
  def bn: typingsSlinky.chromeDashApps.chromeDashAppsStrings.bn = this.cast("bn")
  @scala.inline
  def br: typingsSlinky.chromeDashApps.chromeDashAppsStrings.br = this.cast("br")
  @scala.inline
  def bs: typingsSlinky.chromeDashApps.chromeDashAppsStrings.bs = this.cast("bs")
  @scala.inline
  def ca: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ca = this.cast("ca")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ceb: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ceb = this.cast("ceb")
  @scala.inline
  def ckb: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ckb = this.cast("ckb")
  @scala.inline
  def co: typingsSlinky.chromeDashApps.chromeDashAppsStrings.co = this.cast("co")
  @scala.inline
  def cs: typingsSlinky.chromeDashApps.chromeDashAppsStrings.cs = this.cast("cs")
  @scala.inline
  def cy: typingsSlinky.chromeDashApps.chromeDashAppsStrings.cy = this.cast("cy")
  @scala.inline
  def da: typingsSlinky.chromeDashApps.chromeDashAppsStrings.da = this.cast("da")
  @scala.inline
  def de: typingsSlinky.chromeDashApps.chromeDashAppsStrings.de = this.cast("de")
  @scala.inline
  def `de-AT`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`de-AT` = this.cast("de-AT")
  @scala.inline
  def `de-CH`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`de-CH` = this.cast("de-CH")
  @scala.inline
  def `de-DE`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`de-DE` = this.cast("de-DE")
  @scala.inline
  def `de-LI`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`de-LI` = this.cast("de-LI")
  @scala.inline
  def el: typingsSlinky.chromeDashApps.chromeDashAppsStrings.el = this.cast("el")
  @scala.inline
  def en: typingsSlinky.chromeDashApps.chromeDashAppsStrings.en = this.cast("en")
  @scala.inline
  def `en-AU`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`en-AU` = this.cast("en-AU")
  @scala.inline
  def `en-CA`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`en-CA` = this.cast("en-CA")
  @scala.inline
  def `en-GB`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`en-GB` = this.cast("en-GB")
  @scala.inline
  def `en-IN`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`en-IN` = this.cast("en-IN")
  @scala.inline
  def `en-NZ`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`en-NZ` = this.cast("en-NZ")
  @scala.inline
  def `en-US`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`en-US` = this.cast("en-US")
  @scala.inline
  def `en-ZA`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`en-ZA` = this.cast("en-ZA")
  @scala.inline
  def en_001: typingsSlinky.chromeDashApps.chromeDashAppsStrings.en_001 = this.cast("en_001")
  @scala.inline
  def en_150: typingsSlinky.chromeDashApps.chromeDashAppsStrings.en_150 = this.cast("en_150")
  @scala.inline
  def eo: typingsSlinky.chromeDashApps.chromeDashAppsStrings.eo = this.cast("eo")
  @scala.inline
  def es: typingsSlinky.chromeDashApps.chromeDashAppsStrings.es = this.cast("es")
  @scala.inline
  def `es-419`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-419` = this.cast("es-419")
  @scala.inline
  def `es-AR`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-AR` = this.cast("es-AR")
  @scala.inline
  def `es-CL`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-CL` = this.cast("es-CL")
  @scala.inline
  def `es-CO`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-CO` = this.cast("es-CO")
  @scala.inline
  def `es-CR`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-CR` = this.cast("es-CR")
  @scala.inline
  def `es-ES`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-ES` = this.cast("es-ES")
  @scala.inline
  def `es-HN`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-HN` = this.cast("es-HN")
  @scala.inline
  def `es-MX`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-MX` = this.cast("es-MX")
  @scala.inline
  def `es-PE`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-PE` = this.cast("es-PE")
  @scala.inline
  def `es-US`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-US` = this.cast("es-US")
  @scala.inline
  def `es-UY`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-UY` = this.cast("es-UY")
  @scala.inline
  def `es-VE`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`es-VE` = this.cast("es-VE")
  @scala.inline
  def et: typingsSlinky.chromeDashApps.chromeDashAppsStrings.et = this.cast("et")
  @scala.inline
  def eu: typingsSlinky.chromeDashApps.chromeDashAppsStrings.eu = this.cast("eu")
  @scala.inline
  def fa: typingsSlinky.chromeDashApps.chromeDashAppsStrings.fa = this.cast("fa")
  @scala.inline
  def fi: typingsSlinky.chromeDashApps.chromeDashAppsStrings.fi = this.cast("fi")
  @scala.inline
  def fil: typingsSlinky.chromeDashApps.chromeDashAppsStrings.fil = this.cast("fil")
  @scala.inline
  def fo: typingsSlinky.chromeDashApps.chromeDashAppsStrings.fo = this.cast("fo")
  @scala.inline
  def fr: typingsSlinky.chromeDashApps.chromeDashAppsStrings.fr = this.cast("fr")
  @scala.inline
  def `fr-CA`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`fr-CA` = this.cast("fr-CA")
  @scala.inline
  def `fr-CH`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`fr-CH` = this.cast("fr-CH")
  @scala.inline
  def `fr-FR`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`fr-FR` = this.cast("fr-FR")
  @scala.inline
  def fy: typingsSlinky.chromeDashApps.chromeDashAppsStrings.fy = this.cast("fy")
  @scala.inline
  def ga: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ga = this.cast("ga")
  @scala.inline
  def gd: typingsSlinky.chromeDashApps.chromeDashAppsStrings.gd = this.cast("gd")
  @scala.inline
  def gl: typingsSlinky.chromeDashApps.chromeDashAppsStrings.gl = this.cast("gl")
  @scala.inline
  def gn: typingsSlinky.chromeDashApps.chromeDashAppsStrings.gn = this.cast("gn")
  @scala.inline
  def gu: typingsSlinky.chromeDashApps.chromeDashAppsStrings.gu = this.cast("gu")
  @scala.inline
  def ha: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ha = this.cast("ha")
  @scala.inline
  def haw: typingsSlinky.chromeDashApps.chromeDashAppsStrings.haw = this.cast("haw")
  @scala.inline
  def he: typingsSlinky.chromeDashApps.chromeDashAppsStrings.he = this.cast("he")
  @scala.inline
  def hi: typingsSlinky.chromeDashApps.chromeDashAppsStrings.hi = this.cast("hi")
  @scala.inline
  def hmn: typingsSlinky.chromeDashApps.chromeDashAppsStrings.hmn = this.cast("hmn")
  @scala.inline
  def hr: typingsSlinky.chromeDashApps.chromeDashAppsStrings.hr = this.cast("hr")
  @scala.inline
  def ht: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ht = this.cast("ht")
  @scala.inline
  def hu: typingsSlinky.chromeDashApps.chromeDashAppsStrings.hu = this.cast("hu")
  @scala.inline
  def hy: typingsSlinky.chromeDashApps.chromeDashAppsStrings.hy = this.cast("hy")
  @scala.inline
  def ia: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ia = this.cast("ia")
  @scala.inline
  def id: typingsSlinky.chromeDashApps.chromeDashAppsStrings.id = this.cast("id")
  @scala.inline
  def ig: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ig = this.cast("ig")
  @scala.inline
  def is: typingsSlinky.chromeDashApps.chromeDashAppsStrings.is = this.cast("is")
  @scala.inline
  def it: typingsSlinky.chromeDashApps.chromeDashAppsStrings.it = this.cast("it")
  @scala.inline
  def `it-CH`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`it-CH` = this.cast("it-CH")
  @scala.inline
  def `it-IT`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`it-IT` = this.cast("it-IT")
  @scala.inline
  def ja: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ja = this.cast("ja")
  @scala.inline
  def jv: typingsSlinky.chromeDashApps.chromeDashAppsStrings.jv = this.cast("jv")
  @scala.inline
  def ka: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ka = this.cast("ka")
  @scala.inline
  def kk: typingsSlinky.chromeDashApps.chromeDashAppsStrings.kk = this.cast("kk")
  @scala.inline
  def km: typingsSlinky.chromeDashApps.chromeDashAppsStrings.km = this.cast("km")
  @scala.inline
  def kn: typingsSlinky.chromeDashApps.chromeDashAppsStrings.kn = this.cast("kn")
  @scala.inline
  def ko: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ko = this.cast("ko")
  @scala.inline
  def ku: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ku = this.cast("ku")
  @scala.inline
  def ky: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ky = this.cast("ky")
  @scala.inline
  def la: typingsSlinky.chromeDashApps.chromeDashAppsStrings.la = this.cast("la")
  @scala.inline
  def lb: typingsSlinky.chromeDashApps.chromeDashAppsStrings.lb = this.cast("lb")
  @scala.inline
  def ln: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ln = this.cast("ln")
  @scala.inline
  def lo: typingsSlinky.chromeDashApps.chromeDashAppsStrings.lo = this.cast("lo")
  @scala.inline
  def lt: typingsSlinky.chromeDashApps.chromeDashAppsStrings.lt = this.cast("lt")
  @scala.inline
  def lv: typingsSlinky.chromeDashApps.chromeDashAppsStrings.lv = this.cast("lv")
  @scala.inline
  def mg: typingsSlinky.chromeDashApps.chromeDashAppsStrings.mg = this.cast("mg")
  @scala.inline
  def mi: typingsSlinky.chromeDashApps.chromeDashAppsStrings.mi = this.cast("mi")
  @scala.inline
  def mk: typingsSlinky.chromeDashApps.chromeDashAppsStrings.mk = this.cast("mk")
  @scala.inline
  def ml: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ml = this.cast("ml")
  @scala.inline
  def mn: typingsSlinky.chromeDashApps.chromeDashAppsStrings.mn = this.cast("mn")
  @scala.inline
  def mo: typingsSlinky.chromeDashApps.chromeDashAppsStrings.mo = this.cast("mo")
  @scala.inline
  def mr: typingsSlinky.chromeDashApps.chromeDashAppsStrings.mr = this.cast("mr")
  @scala.inline
  def ms: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ms = this.cast("ms")
  @scala.inline
  def mt: typingsSlinky.chromeDashApps.chromeDashAppsStrings.mt = this.cast("mt")
  @scala.inline
  def my: typingsSlinky.chromeDashApps.chromeDashAppsStrings.my = this.cast("my")
  @scala.inline
  def nb: typingsSlinky.chromeDashApps.chromeDashAppsStrings.nb = this.cast("nb")
  @scala.inline
  def ne: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ne = this.cast("ne")
  @scala.inline
  def nl: typingsSlinky.chromeDashApps.chromeDashAppsStrings.nl = this.cast("nl")
  @scala.inline
  def nn: typingsSlinky.chromeDashApps.chromeDashAppsStrings.nn = this.cast("nn")
  @scala.inline
  def no: typingsSlinky.chromeDashApps.chromeDashAppsStrings.no = this.cast("no")
  @scala.inline
  def ny: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ny = this.cast("ny")
  @scala.inline
  def oc: typingsSlinky.chromeDashApps.chromeDashAppsStrings.oc = this.cast("oc")
  @scala.inline
  def om: typingsSlinky.chromeDashApps.chromeDashAppsStrings.om = this.cast("om")
  @scala.inline
  def or: typingsSlinky.chromeDashApps.chromeDashAppsStrings.or = this.cast("or")
  @scala.inline
  def pa: typingsSlinky.chromeDashApps.chromeDashAppsStrings.pa = this.cast("pa")
  @scala.inline
  def pl: typingsSlinky.chromeDashApps.chromeDashAppsStrings.pl = this.cast("pl")
  @scala.inline
  def ps: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ps = this.cast("ps")
  @scala.inline
  def pt: typingsSlinky.chromeDashApps.chromeDashAppsStrings.pt = this.cast("pt")
  @scala.inline
  def `pt-BR`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`pt-BR` = this.cast("pt-BR")
  @scala.inline
  def `pt-PT`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`pt-PT` = this.cast("pt-PT")
  @scala.inline
  def qu: typingsSlinky.chromeDashApps.chromeDashAppsStrings.qu = this.cast("qu")
  @scala.inline
  def rm: typingsSlinky.chromeDashApps.chromeDashAppsStrings.rm = this.cast("rm")
  @scala.inline
  def ro: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ro = this.cast("ro")
  @scala.inline
  def ru: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ru = this.cast("ru")
  @scala.inline
  def sd: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sd = this.cast("sd")
  @scala.inline
  def sh: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sh = this.cast("sh")
  @scala.inline
  def si: typingsSlinky.chromeDashApps.chromeDashAppsStrings.si = this.cast("si")
  @scala.inline
  def sk: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sk = this.cast("sk")
  @scala.inline
  def sl: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sl = this.cast("sl")
  @scala.inline
  def sm: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sm = this.cast("sm")
  @scala.inline
  def sn: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sn = this.cast("sn")
  @scala.inline
  def so: typingsSlinky.chromeDashApps.chromeDashAppsStrings.so = this.cast("so")
  @scala.inline
  def sq: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sq = this.cast("sq")
  @scala.inline
  def sr: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sr = this.cast("sr")
  @scala.inline
  def st: typingsSlinky.chromeDashApps.chromeDashAppsStrings.st = this.cast("st")
  @scala.inline
  def su: typingsSlinky.chromeDashApps.chromeDashAppsStrings.su = this.cast("su")
  @scala.inline
  def sv: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sv = this.cast("sv")
  @scala.inline
  def sw: typingsSlinky.chromeDashApps.chromeDashAppsStrings.sw = this.cast("sw")
  @scala.inline
  def ta: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ta = this.cast("ta")
  @scala.inline
  def te: typingsSlinky.chromeDashApps.chromeDashAppsStrings.te = this.cast("te")
  @scala.inline
  def tg: typingsSlinky.chromeDashApps.chromeDashAppsStrings.tg = this.cast("tg")
  @scala.inline
  def th: typingsSlinky.chromeDashApps.chromeDashAppsStrings.th = this.cast("th")
  @scala.inline
  def ti: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ti = this.cast("ti")
  @scala.inline
  def tk: typingsSlinky.chromeDashApps.chromeDashAppsStrings.tk = this.cast("tk")
  @scala.inline
  def to: typingsSlinky.chromeDashApps.chromeDashAppsStrings.to = this.cast("to")
  @scala.inline
  def tr: typingsSlinky.chromeDashApps.chromeDashAppsStrings.tr = this.cast("tr")
  @scala.inline
  def tt: typingsSlinky.chromeDashApps.chromeDashAppsStrings.tt = this.cast("tt")
  @scala.inline
  def tw: typingsSlinky.chromeDashApps.chromeDashAppsStrings.tw = this.cast("tw")
  @scala.inline
  def ug: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ug = this.cast("ug")
  @scala.inline
  def uk: typingsSlinky.chromeDashApps.chromeDashAppsStrings.uk = this.cast("uk")
  @scala.inline
  def und: typingsSlinky.chromeDashApps.chromeDashAppsStrings.und = this.cast("und")
  @scala.inline
  def ur: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ur = this.cast("ur")
  @scala.inline
  def uz: typingsSlinky.chromeDashApps.chromeDashAppsStrings.uz = this.cast("uz")
  @scala.inline
  def vi: typingsSlinky.chromeDashApps.chromeDashAppsStrings.vi = this.cast("vi")
  @scala.inline
  def wa: typingsSlinky.chromeDashApps.chromeDashAppsStrings.wa = this.cast("wa")
  @scala.inline
  def xh: typingsSlinky.chromeDashApps.chromeDashAppsStrings.xh = this.cast("xh")
  @scala.inline
  def yi: typingsSlinky.chromeDashApps.chromeDashAppsStrings.yi = this.cast("yi")
  @scala.inline
  def yo: typingsSlinky.chromeDashApps.chromeDashAppsStrings.yo = this.cast("yo")
  @scala.inline
  def zh: typingsSlinky.chromeDashApps.chromeDashAppsStrings.zh = this.cast("zh")
  @scala.inline
  def `zh-CN`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`zh-CN` = this.cast("zh-CN")
  @scala.inline
  def `zh-HK`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`zh-HK` = this.cast("zh-HK")
  @scala.inline
  def `zh-TW`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`zh-TW` = this.cast("zh-TW")
  @scala.inline
  def zh_hans_cn: typingsSlinky.chromeDashApps.chromeDashAppsStrings.zh_hans_cn = this.cast("zh_hans_cn")
  @scala.inline
  def zh_hans_sg: typingsSlinky.chromeDashApps.chromeDashAppsStrings.zh_hans_sg = this.cast("zh_hans_sg")
  @scala.inline
  def zh_hant_hk: typingsSlinky.chromeDashApps.chromeDashAppsStrings.zh_hant_hk = this.cast("zh_hant_hk")
  @scala.inline
  def zh_hant_mo: typingsSlinky.chromeDashApps.chromeDashAppsStrings.zh_hant_mo = this.cast("zh_hant_mo")
  @scala.inline
  def zh_hant_tw: typingsSlinky.chromeDashApps.chromeDashAppsStrings.zh_hant_tw = this.cast("zh_hant_tw")
  @scala.inline
  def zu: typingsSlinky.chromeDashApps.chromeDashAppsStrings.zu = this.cast("zu")
}

