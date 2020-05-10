package typingsSlinky.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Text option opentype features as listed at https://docs.microsoft.com/en-us/typography/opentype/spec/featurelist
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pdfkit.pdfkitStrings.aalt
  - typingsSlinky.pdfkit.pdfkitStrings.abvf
  - typingsSlinky.pdfkit.pdfkitStrings.abvm
  - typingsSlinky.pdfkit.pdfkitStrings.abvs
  - typingsSlinky.pdfkit.pdfkitStrings.afrc
  - typingsSlinky.pdfkit.pdfkitStrings.akhn
  - typingsSlinky.pdfkit.pdfkitStrings.blwf
  - typingsSlinky.pdfkit.pdfkitStrings.blwm
  - typingsSlinky.pdfkit.pdfkitStrings.blws
  - typingsSlinky.pdfkit.pdfkitStrings.calt
  - typingsSlinky.pdfkit.pdfkitStrings.`case`
  - typingsSlinky.pdfkit.pdfkitStrings.cfar
  - typingsSlinky.pdfkit.pdfkitStrings.cjct
  - typingsSlinky.pdfkit.pdfkitStrings.clig
  - typingsSlinky.pdfkit.pdfkitStrings.cpct
  - typingsSlinky.pdfkit.pdfkitStrings.cpsp
  - typingsSlinky.pdfkit.pdfkitStrings.cswh
  - typingsSlinky.pdfkit.pdfkitStrings.curs
  - typingsSlinky.pdfkit.pdfkitStrings.cv01
  - typingsSlinky.pdfkit.pdfkitStrings.cv02
  - typingsSlinky.pdfkit.pdfkitStrings.cv03
  - typingsSlinky.pdfkit.pdfkitStrings.cv04
  - typingsSlinky.pdfkit.pdfkitStrings.cv05
  - typingsSlinky.pdfkit.pdfkitStrings.cv06
  - typingsSlinky.pdfkit.pdfkitStrings.cv07
  - typingsSlinky.pdfkit.pdfkitStrings.cv08
  - typingsSlinky.pdfkit.pdfkitStrings.cv09
  - typingsSlinky.pdfkit.pdfkitStrings.cv10
  - typingsSlinky.pdfkit.pdfkitStrings.cv11
  - typingsSlinky.pdfkit.pdfkitStrings.cv12
  - typingsSlinky.pdfkit.pdfkitStrings.cv13
  - typingsSlinky.pdfkit.pdfkitStrings.cv14
  - typingsSlinky.pdfkit.pdfkitStrings.cv15
  - typingsSlinky.pdfkit.pdfkitStrings.cv16
  - typingsSlinky.pdfkit.pdfkitStrings.cv17
  - typingsSlinky.pdfkit.pdfkitStrings.cv18
  - typingsSlinky.pdfkit.pdfkitStrings.cv19
  - typingsSlinky.pdfkit.pdfkitStrings.cv20
  - typingsSlinky.pdfkit.pdfkitStrings.cv21
  - typingsSlinky.pdfkit.pdfkitStrings.cv22
  - typingsSlinky.pdfkit.pdfkitStrings.cv23
  - typingsSlinky.pdfkit.pdfkitStrings.cv24
  - typingsSlinky.pdfkit.pdfkitStrings.cv25
  - typingsSlinky.pdfkit.pdfkitStrings.cv26
  - typingsSlinky.pdfkit.pdfkitStrings.cv27
  - typingsSlinky.pdfkit.pdfkitStrings.cv28
  - typingsSlinky.pdfkit.pdfkitStrings.cv29
  - typingsSlinky.pdfkit.pdfkitStrings.cv30
  - typingsSlinky.pdfkit.pdfkitStrings.cv31
  - typingsSlinky.pdfkit.pdfkitStrings.cv32
  - typingsSlinky.pdfkit.pdfkitStrings.cv33
  - typingsSlinky.pdfkit.pdfkitStrings.cv34
  - typingsSlinky.pdfkit.pdfkitStrings.cv35
  - typingsSlinky.pdfkit.pdfkitStrings.cv36
  - typingsSlinky.pdfkit.pdfkitStrings.cv37
  - typingsSlinky.pdfkit.pdfkitStrings.cv38
  - typingsSlinky.pdfkit.pdfkitStrings.cv39
  - typingsSlinky.pdfkit.pdfkitStrings.cv40
  - typingsSlinky.pdfkit.pdfkitStrings.cv41
  - typingsSlinky.pdfkit.pdfkitStrings.cv42
  - typingsSlinky.pdfkit.pdfkitStrings.cv43
  - typingsSlinky.pdfkit.pdfkitStrings.cv44
  - typingsSlinky.pdfkit.pdfkitStrings.cv45
  - typingsSlinky.pdfkit.pdfkitStrings.cv46
  - typingsSlinky.pdfkit.pdfkitStrings.cv47
  - typingsSlinky.pdfkit.pdfkitStrings.cv48
  - typingsSlinky.pdfkit.pdfkitStrings.cv49
  - typingsSlinky.pdfkit.pdfkitStrings.cv50
  - typingsSlinky.pdfkit.pdfkitStrings.cv51
  - typingsSlinky.pdfkit.pdfkitStrings.cv52
  - typingsSlinky.pdfkit.pdfkitStrings.cv53
  - typingsSlinky.pdfkit.pdfkitStrings.cv54
  - typingsSlinky.pdfkit.pdfkitStrings.cv55
  - typingsSlinky.pdfkit.pdfkitStrings.cv56
  - typingsSlinky.pdfkit.pdfkitStrings.cv57
  - typingsSlinky.pdfkit.pdfkitStrings.cv58
  - typingsSlinky.pdfkit.pdfkitStrings.cv59
  - typingsSlinky.pdfkit.pdfkitStrings.cv60
  - typingsSlinky.pdfkit.pdfkitStrings.cv61
  - typingsSlinky.pdfkit.pdfkitStrings.cv62
  - typingsSlinky.pdfkit.pdfkitStrings.cv63
  - typingsSlinky.pdfkit.pdfkitStrings.cv64
  - typingsSlinky.pdfkit.pdfkitStrings.cv65
  - typingsSlinky.pdfkit.pdfkitStrings.cv66
  - typingsSlinky.pdfkit.pdfkitStrings.cv67
  - typingsSlinky.pdfkit.pdfkitStrings.cv68
  - typingsSlinky.pdfkit.pdfkitStrings.cv69
  - typingsSlinky.pdfkit.pdfkitStrings.cv70
  - typingsSlinky.pdfkit.pdfkitStrings.cv71
  - typingsSlinky.pdfkit.pdfkitStrings.cv72
  - typingsSlinky.pdfkit.pdfkitStrings.cv73
  - typingsSlinky.pdfkit.pdfkitStrings.cv74
  - typingsSlinky.pdfkit.pdfkitStrings.cv75
  - typingsSlinky.pdfkit.pdfkitStrings.cv76
  - typingsSlinky.pdfkit.pdfkitStrings.cv77
  - typingsSlinky.pdfkit.pdfkitStrings.cv78
  - typingsSlinky.pdfkit.pdfkitStrings.cv79
  - typingsSlinky.pdfkit.pdfkitStrings.cv80
  - typingsSlinky.pdfkit.pdfkitStrings.cv81
  - typingsSlinky.pdfkit.pdfkitStrings.cv82
  - typingsSlinky.pdfkit.pdfkitStrings.cv83
  - typingsSlinky.pdfkit.pdfkitStrings.cv84
  - typingsSlinky.pdfkit.pdfkitStrings.cv85
  - typingsSlinky.pdfkit.pdfkitStrings.cv86
  - typingsSlinky.pdfkit.pdfkitStrings.cv87
  - typingsSlinky.pdfkit.pdfkitStrings.cv88
  - typingsSlinky.pdfkit.pdfkitStrings.cv89
  - typingsSlinky.pdfkit.pdfkitStrings.cv90
  - typingsSlinky.pdfkit.pdfkitStrings.cv91
  - typingsSlinky.pdfkit.pdfkitStrings.cv92
  - typingsSlinky.pdfkit.pdfkitStrings.cv93
  - typingsSlinky.pdfkit.pdfkitStrings.cv94
  - typingsSlinky.pdfkit.pdfkitStrings.cv95
  - typingsSlinky.pdfkit.pdfkitStrings.cv96
  - typingsSlinky.pdfkit.pdfkitStrings.cv97
  - typingsSlinky.pdfkit.pdfkitStrings.cv98
  - typingsSlinky.pdfkit.pdfkitStrings.cv99
  - typingsSlinky.pdfkit.pdfkitStrings.c2pc
  - typingsSlinky.pdfkit.pdfkitStrings.c2sc
  - typingsSlinky.pdfkit.pdfkitStrings.dist
  - typingsSlinky.pdfkit.pdfkitStrings.ccmp
  - typingsSlinky.pdfkit.pdfkitStrings.dlig
  - typingsSlinky.pdfkit.pdfkitStrings.dnom
  - typingsSlinky.pdfkit.pdfkitStrings.dtls
  - typingsSlinky.pdfkit.pdfkitStrings.expt
  - typingsSlinky.pdfkit.pdfkitStrings.falt
  - typingsSlinky.pdfkit.pdfkitStrings.fin2
  - typingsSlinky.pdfkit.pdfkitStrings.fin3
  - typingsSlinky.pdfkit.pdfkitStrings.fina
  - typingsSlinky.pdfkit.pdfkitStrings.flac
  - typingsSlinky.pdfkit.pdfkitStrings.frac
  - typingsSlinky.pdfkit.pdfkitStrings.fwid
  - typingsSlinky.pdfkit.pdfkitStrings.half
  - typingsSlinky.pdfkit.pdfkitStrings.haln
  - typingsSlinky.pdfkit.pdfkitStrings.halt
  - typingsSlinky.pdfkit.pdfkitStrings.hist
  - typingsSlinky.pdfkit.pdfkitStrings.hkna
  - typingsSlinky.pdfkit.pdfkitStrings.hlig
  - typingsSlinky.pdfkit.pdfkitStrings.hngl
  - typingsSlinky.pdfkit.pdfkitStrings.hojo
  - typingsSlinky.pdfkit.pdfkitStrings.hwid
  - typingsSlinky.pdfkit.pdfkitStrings.init
  - typingsSlinky.pdfkit.pdfkitStrings.isol
  - typingsSlinky.pdfkit.pdfkitStrings.ital
  - typingsSlinky.pdfkit.pdfkitStrings.jalt
  - typingsSlinky.pdfkit.pdfkitStrings.jp78
  - typingsSlinky.pdfkit.pdfkitStrings.jp83
  - typingsSlinky.pdfkit.pdfkitStrings.jp90
  - typingsSlinky.pdfkit.pdfkitStrings.jp04
  - typingsSlinky.pdfkit.pdfkitStrings.kern
  - typingsSlinky.pdfkit.pdfkitStrings.lfbd
  - typingsSlinky.pdfkit.pdfkitStrings.liga
  - typingsSlinky.pdfkit.pdfkitStrings.ljmo
  - typingsSlinky.pdfkit.pdfkitStrings.lnum
  - typingsSlinky.pdfkit.pdfkitStrings.locl
  - typingsSlinky.pdfkit.pdfkitStrings.ltra
  - typingsSlinky.pdfkit.pdfkitStrings.ltrm
  - typingsSlinky.pdfkit.pdfkitStrings.mark
  - typingsSlinky.pdfkit.pdfkitStrings.med2
  - typingsSlinky.pdfkit.pdfkitStrings.medi
  - typingsSlinky.pdfkit.pdfkitStrings.mgrk
  - typingsSlinky.pdfkit.pdfkitStrings.mkmk
  - typingsSlinky.pdfkit.pdfkitStrings.mset
  - typingsSlinky.pdfkit.pdfkitStrings.nalt
  - typingsSlinky.pdfkit.pdfkitStrings.nlck
  - typingsSlinky.pdfkit.pdfkitStrings.nukt
  - typingsSlinky.pdfkit.pdfkitStrings.numr
  - typingsSlinky.pdfkit.pdfkitStrings.onum
  - typingsSlinky.pdfkit.pdfkitStrings.opbd
  - typingsSlinky.pdfkit.pdfkitStrings.ordn
  - typingsSlinky.pdfkit.pdfkitStrings.ornm
  - typingsSlinky.pdfkit.pdfkitStrings.palt
  - typingsSlinky.pdfkit.pdfkitStrings.pcap
  - typingsSlinky.pdfkit.pdfkitStrings.pkna
  - typingsSlinky.pdfkit.pdfkitStrings.pnum
  - typingsSlinky.pdfkit.pdfkitStrings.pref
  - typingsSlinky.pdfkit.pdfkitStrings.pres
  - typingsSlinky.pdfkit.pdfkitStrings.pstf
  - typingsSlinky.pdfkit.pdfkitStrings.psts
  - typingsSlinky.pdfkit.pdfkitStrings.pwid
  - typingsSlinky.pdfkit.pdfkitStrings.qwid
  - typingsSlinky.pdfkit.pdfkitStrings.rand
  - typingsSlinky.pdfkit.pdfkitStrings.rclt
  - typingsSlinky.pdfkit.pdfkitStrings.rkrf
  - typingsSlinky.pdfkit.pdfkitStrings.rlig
  - typingsSlinky.pdfkit.pdfkitStrings.rphf
  - typingsSlinky.pdfkit.pdfkitStrings.rtbd
  - typingsSlinky.pdfkit.pdfkitStrings.rtla
  - typingsSlinky.pdfkit.pdfkitStrings.rtlm
  - typingsSlinky.pdfkit.pdfkitStrings.ruby
  - typingsSlinky.pdfkit.pdfkitStrings.rvrn
  - typingsSlinky.pdfkit.pdfkitStrings.salt
  - typingsSlinky.pdfkit.pdfkitStrings.sinf
  - typingsSlinky.pdfkit.pdfkitStrings.size
  - typingsSlinky.pdfkit.pdfkitStrings.smcp
  - typingsSlinky.pdfkit.pdfkitStrings.smpl
  - typingsSlinky.pdfkit.pdfkitStrings.ss01
  - typingsSlinky.pdfkit.pdfkitStrings.ss02
  - typingsSlinky.pdfkit.pdfkitStrings.ss03
  - typingsSlinky.pdfkit.pdfkitStrings.ss04
  - typingsSlinky.pdfkit.pdfkitStrings.ss05
  - typingsSlinky.pdfkit.pdfkitStrings.ss06
  - typingsSlinky.pdfkit.pdfkitStrings.ss07
  - typingsSlinky.pdfkit.pdfkitStrings.ss08
  - typingsSlinky.pdfkit.pdfkitStrings.ss09
  - typingsSlinky.pdfkit.pdfkitStrings.ss10
  - typingsSlinky.pdfkit.pdfkitStrings.ss11
  - typingsSlinky.pdfkit.pdfkitStrings.ss12
  - typingsSlinky.pdfkit.pdfkitStrings.ss13
  - typingsSlinky.pdfkit.pdfkitStrings.ss14
  - typingsSlinky.pdfkit.pdfkitStrings.ss15
  - typingsSlinky.pdfkit.pdfkitStrings.ss16
  - typingsSlinky.pdfkit.pdfkitStrings.ss17
  - typingsSlinky.pdfkit.pdfkitStrings.ss18
  - typingsSlinky.pdfkit.pdfkitStrings.ss19
  - typingsSlinky.pdfkit.pdfkitStrings.ss20
  - typingsSlinky.pdfkit.pdfkitStrings.ssty
  - typingsSlinky.pdfkit.pdfkitStrings.stch
  - typingsSlinky.pdfkit.pdfkitStrings.subs
  - typingsSlinky.pdfkit.pdfkitStrings.sups
  - typingsSlinky.pdfkit.pdfkitStrings.swsh
  - typingsSlinky.pdfkit.pdfkitStrings.titl
  - typingsSlinky.pdfkit.pdfkitStrings.tjmo
  - typingsSlinky.pdfkit.pdfkitStrings.tnam
  - typingsSlinky.pdfkit.pdfkitStrings.tnum
  - typingsSlinky.pdfkit.pdfkitStrings.trad
  - typingsSlinky.pdfkit.pdfkitStrings.twid
  - typingsSlinky.pdfkit.pdfkitStrings.unic
  - typingsSlinky.pdfkit.pdfkitStrings.valt
  - typingsSlinky.pdfkit.pdfkitStrings.vatu
  - typingsSlinky.pdfkit.pdfkitStrings.vert
  - typingsSlinky.pdfkit.pdfkitStrings.vhal
  - typingsSlinky.pdfkit.pdfkitStrings.vjmo
  - typingsSlinky.pdfkit.pdfkitStrings.vkna
  - typingsSlinky.pdfkit.pdfkitStrings.vkrn
  - typingsSlinky.pdfkit.pdfkitStrings.vpal
  - typingsSlinky.pdfkit.pdfkitStrings.vrt2
  - typingsSlinky.pdfkit.pdfkitStrings.vrtr
  - typingsSlinky.pdfkit.pdfkitStrings.zero
*/
trait OpenTypeFeatures extends js.Object

object OpenTypeFeatures {
  @scala.inline
  def aalt: typingsSlinky.pdfkit.pdfkitStrings.aalt = "aalt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.aalt]
  @scala.inline
  def abvf: typingsSlinky.pdfkit.pdfkitStrings.abvf = "abvf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.abvf]
  @scala.inline
  def abvm: typingsSlinky.pdfkit.pdfkitStrings.abvm = "abvm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.abvm]
  @scala.inline
  def abvs: typingsSlinky.pdfkit.pdfkitStrings.abvs = "abvs".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.abvs]
  @scala.inline
  def afrc: typingsSlinky.pdfkit.pdfkitStrings.afrc = "afrc".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.afrc]
  @scala.inline
  def akhn: typingsSlinky.pdfkit.pdfkitStrings.akhn = "akhn".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.akhn]
  @scala.inline
  def blwf: typingsSlinky.pdfkit.pdfkitStrings.blwf = "blwf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.blwf]
  @scala.inline
  def blwm: typingsSlinky.pdfkit.pdfkitStrings.blwm = "blwm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.blwm]
  @scala.inline
  def blws: typingsSlinky.pdfkit.pdfkitStrings.blws = "blws".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.blws]
  @scala.inline
  def c2pc: typingsSlinky.pdfkit.pdfkitStrings.c2pc = "c2pc".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.c2pc]
  @scala.inline
  def c2sc: typingsSlinky.pdfkit.pdfkitStrings.c2sc = "c2sc".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.c2sc]
  @scala.inline
  def calt: typingsSlinky.pdfkit.pdfkitStrings.calt = "calt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.calt]
  @scala.inline
  def `case`: typingsSlinky.pdfkit.pdfkitStrings.`case` = "case".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.`case`]
  @scala.inline
  def ccmp: typingsSlinky.pdfkit.pdfkitStrings.ccmp = "ccmp".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ccmp]
  @scala.inline
  def cfar: typingsSlinky.pdfkit.pdfkitStrings.cfar = "cfar".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cfar]
  @scala.inline
  def cjct: typingsSlinky.pdfkit.pdfkitStrings.cjct = "cjct".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cjct]
  @scala.inline
  def clig: typingsSlinky.pdfkit.pdfkitStrings.clig = "clig".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.clig]
  @scala.inline
  def cpct: typingsSlinky.pdfkit.pdfkitStrings.cpct = "cpct".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cpct]
  @scala.inline
  def cpsp: typingsSlinky.pdfkit.pdfkitStrings.cpsp = "cpsp".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cpsp]
  @scala.inline
  def cswh: typingsSlinky.pdfkit.pdfkitStrings.cswh = "cswh".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cswh]
  @scala.inline
  def curs: typingsSlinky.pdfkit.pdfkitStrings.curs = "curs".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.curs]
  @scala.inline
  def cv01: typingsSlinky.pdfkit.pdfkitStrings.cv01 = "cv01".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv01]
  @scala.inline
  def cv02: typingsSlinky.pdfkit.pdfkitStrings.cv02 = "cv02".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv02]
  @scala.inline
  def cv03: typingsSlinky.pdfkit.pdfkitStrings.cv03 = "cv03".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv03]
  @scala.inline
  def cv04: typingsSlinky.pdfkit.pdfkitStrings.cv04 = "cv04".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv04]
  @scala.inline
  def cv05: typingsSlinky.pdfkit.pdfkitStrings.cv05 = "cv05".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv05]
  @scala.inline
  def cv06: typingsSlinky.pdfkit.pdfkitStrings.cv06 = "cv06".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv06]
  @scala.inline
  def cv07: typingsSlinky.pdfkit.pdfkitStrings.cv07 = "cv07".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv07]
  @scala.inline
  def cv08: typingsSlinky.pdfkit.pdfkitStrings.cv08 = "cv08".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv08]
  @scala.inline
  def cv09: typingsSlinky.pdfkit.pdfkitStrings.cv09 = "cv09".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv09]
  @scala.inline
  def cv10: typingsSlinky.pdfkit.pdfkitStrings.cv10 = "cv10".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv10]
  @scala.inline
  def cv11: typingsSlinky.pdfkit.pdfkitStrings.cv11 = "cv11".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv11]
  @scala.inline
  def cv12: typingsSlinky.pdfkit.pdfkitStrings.cv12 = "cv12".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv12]
  @scala.inline
  def cv13: typingsSlinky.pdfkit.pdfkitStrings.cv13 = "cv13".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv13]
  @scala.inline
  def cv14: typingsSlinky.pdfkit.pdfkitStrings.cv14 = "cv14".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv14]
  @scala.inline
  def cv15: typingsSlinky.pdfkit.pdfkitStrings.cv15 = "cv15".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv15]
  @scala.inline
  def cv16: typingsSlinky.pdfkit.pdfkitStrings.cv16 = "cv16".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv16]
  @scala.inline
  def cv17: typingsSlinky.pdfkit.pdfkitStrings.cv17 = "cv17".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv17]
  @scala.inline
  def cv18: typingsSlinky.pdfkit.pdfkitStrings.cv18 = "cv18".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv18]
  @scala.inline
  def cv19: typingsSlinky.pdfkit.pdfkitStrings.cv19 = "cv19".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv19]
  @scala.inline
  def cv20: typingsSlinky.pdfkit.pdfkitStrings.cv20 = "cv20".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv20]
  @scala.inline
  def cv21: typingsSlinky.pdfkit.pdfkitStrings.cv21 = "cv21".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv21]
  @scala.inline
  def cv22: typingsSlinky.pdfkit.pdfkitStrings.cv22 = "cv22".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv22]
  @scala.inline
  def cv23: typingsSlinky.pdfkit.pdfkitStrings.cv23 = "cv23".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv23]
  @scala.inline
  def cv24: typingsSlinky.pdfkit.pdfkitStrings.cv24 = "cv24".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv24]
  @scala.inline
  def cv25: typingsSlinky.pdfkit.pdfkitStrings.cv25 = "cv25".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv25]
  @scala.inline
  def cv26: typingsSlinky.pdfkit.pdfkitStrings.cv26 = "cv26".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv26]
  @scala.inline
  def cv27: typingsSlinky.pdfkit.pdfkitStrings.cv27 = "cv27".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv27]
  @scala.inline
  def cv28: typingsSlinky.pdfkit.pdfkitStrings.cv28 = "cv28".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv28]
  @scala.inline
  def cv29: typingsSlinky.pdfkit.pdfkitStrings.cv29 = "cv29".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv29]
  @scala.inline
  def cv30: typingsSlinky.pdfkit.pdfkitStrings.cv30 = "cv30".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv30]
  @scala.inline
  def cv31: typingsSlinky.pdfkit.pdfkitStrings.cv31 = "cv31".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv31]
  @scala.inline
  def cv32: typingsSlinky.pdfkit.pdfkitStrings.cv32 = "cv32".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv32]
  @scala.inline
  def cv33: typingsSlinky.pdfkit.pdfkitStrings.cv33 = "cv33".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv33]
  @scala.inline
  def cv34: typingsSlinky.pdfkit.pdfkitStrings.cv34 = "cv34".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv34]
  @scala.inline
  def cv35: typingsSlinky.pdfkit.pdfkitStrings.cv35 = "cv35".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv35]
  @scala.inline
  def cv36: typingsSlinky.pdfkit.pdfkitStrings.cv36 = "cv36".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv36]
  @scala.inline
  def cv37: typingsSlinky.pdfkit.pdfkitStrings.cv37 = "cv37".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv37]
  @scala.inline
  def cv38: typingsSlinky.pdfkit.pdfkitStrings.cv38 = "cv38".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv38]
  @scala.inline
  def cv39: typingsSlinky.pdfkit.pdfkitStrings.cv39 = "cv39".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv39]
  @scala.inline
  def cv40: typingsSlinky.pdfkit.pdfkitStrings.cv40 = "cv40".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv40]
  @scala.inline
  def cv41: typingsSlinky.pdfkit.pdfkitStrings.cv41 = "cv41".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv41]
  @scala.inline
  def cv42: typingsSlinky.pdfkit.pdfkitStrings.cv42 = "cv42".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv42]
  @scala.inline
  def cv43: typingsSlinky.pdfkit.pdfkitStrings.cv43 = "cv43".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv43]
  @scala.inline
  def cv44: typingsSlinky.pdfkit.pdfkitStrings.cv44 = "cv44".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv44]
  @scala.inline
  def cv45: typingsSlinky.pdfkit.pdfkitStrings.cv45 = "cv45".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv45]
  @scala.inline
  def cv46: typingsSlinky.pdfkit.pdfkitStrings.cv46 = "cv46".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv46]
  @scala.inline
  def cv47: typingsSlinky.pdfkit.pdfkitStrings.cv47 = "cv47".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv47]
  @scala.inline
  def cv48: typingsSlinky.pdfkit.pdfkitStrings.cv48 = "cv48".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv48]
  @scala.inline
  def cv49: typingsSlinky.pdfkit.pdfkitStrings.cv49 = "cv49".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv49]
  @scala.inline
  def cv50: typingsSlinky.pdfkit.pdfkitStrings.cv50 = "cv50".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv50]
  @scala.inline
  def cv51: typingsSlinky.pdfkit.pdfkitStrings.cv51 = "cv51".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv51]
  @scala.inline
  def cv52: typingsSlinky.pdfkit.pdfkitStrings.cv52 = "cv52".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv52]
  @scala.inline
  def cv53: typingsSlinky.pdfkit.pdfkitStrings.cv53 = "cv53".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv53]
  @scala.inline
  def cv54: typingsSlinky.pdfkit.pdfkitStrings.cv54 = "cv54".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv54]
  @scala.inline
  def cv55: typingsSlinky.pdfkit.pdfkitStrings.cv55 = "cv55".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv55]
  @scala.inline
  def cv56: typingsSlinky.pdfkit.pdfkitStrings.cv56 = "cv56".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv56]
  @scala.inline
  def cv57: typingsSlinky.pdfkit.pdfkitStrings.cv57 = "cv57".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv57]
  @scala.inline
  def cv58: typingsSlinky.pdfkit.pdfkitStrings.cv58 = "cv58".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv58]
  @scala.inline
  def cv59: typingsSlinky.pdfkit.pdfkitStrings.cv59 = "cv59".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv59]
  @scala.inline
  def cv60: typingsSlinky.pdfkit.pdfkitStrings.cv60 = "cv60".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv60]
  @scala.inline
  def cv61: typingsSlinky.pdfkit.pdfkitStrings.cv61 = "cv61".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv61]
  @scala.inline
  def cv62: typingsSlinky.pdfkit.pdfkitStrings.cv62 = "cv62".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv62]
  @scala.inline
  def cv63: typingsSlinky.pdfkit.pdfkitStrings.cv63 = "cv63".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv63]
  @scala.inline
  def cv64: typingsSlinky.pdfkit.pdfkitStrings.cv64 = "cv64".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv64]
  @scala.inline
  def cv65: typingsSlinky.pdfkit.pdfkitStrings.cv65 = "cv65".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv65]
  @scala.inline
  def cv66: typingsSlinky.pdfkit.pdfkitStrings.cv66 = "cv66".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv66]
  @scala.inline
  def cv67: typingsSlinky.pdfkit.pdfkitStrings.cv67 = "cv67".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv67]
  @scala.inline
  def cv68: typingsSlinky.pdfkit.pdfkitStrings.cv68 = "cv68".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv68]
  @scala.inline
  def cv69: typingsSlinky.pdfkit.pdfkitStrings.cv69 = "cv69".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv69]
  @scala.inline
  def cv70: typingsSlinky.pdfkit.pdfkitStrings.cv70 = "cv70".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv70]
  @scala.inline
  def cv71: typingsSlinky.pdfkit.pdfkitStrings.cv71 = "cv71".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv71]
  @scala.inline
  def cv72: typingsSlinky.pdfkit.pdfkitStrings.cv72 = "cv72".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv72]
  @scala.inline
  def cv73: typingsSlinky.pdfkit.pdfkitStrings.cv73 = "cv73".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv73]
  @scala.inline
  def cv74: typingsSlinky.pdfkit.pdfkitStrings.cv74 = "cv74".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv74]
  @scala.inline
  def cv75: typingsSlinky.pdfkit.pdfkitStrings.cv75 = "cv75".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv75]
  @scala.inline
  def cv76: typingsSlinky.pdfkit.pdfkitStrings.cv76 = "cv76".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv76]
  @scala.inline
  def cv77: typingsSlinky.pdfkit.pdfkitStrings.cv77 = "cv77".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv77]
  @scala.inline
  def cv78: typingsSlinky.pdfkit.pdfkitStrings.cv78 = "cv78".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv78]
  @scala.inline
  def cv79: typingsSlinky.pdfkit.pdfkitStrings.cv79 = "cv79".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv79]
  @scala.inline
  def cv80: typingsSlinky.pdfkit.pdfkitStrings.cv80 = "cv80".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv80]
  @scala.inline
  def cv81: typingsSlinky.pdfkit.pdfkitStrings.cv81 = "cv81".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv81]
  @scala.inline
  def cv82: typingsSlinky.pdfkit.pdfkitStrings.cv82 = "cv82".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv82]
  @scala.inline
  def cv83: typingsSlinky.pdfkit.pdfkitStrings.cv83 = "cv83".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv83]
  @scala.inline
  def cv84: typingsSlinky.pdfkit.pdfkitStrings.cv84 = "cv84".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv84]
  @scala.inline
  def cv85: typingsSlinky.pdfkit.pdfkitStrings.cv85 = "cv85".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv85]
  @scala.inline
  def cv86: typingsSlinky.pdfkit.pdfkitStrings.cv86 = "cv86".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv86]
  @scala.inline
  def cv87: typingsSlinky.pdfkit.pdfkitStrings.cv87 = "cv87".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv87]
  @scala.inline
  def cv88: typingsSlinky.pdfkit.pdfkitStrings.cv88 = "cv88".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv88]
  @scala.inline
  def cv89: typingsSlinky.pdfkit.pdfkitStrings.cv89 = "cv89".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv89]
  @scala.inline
  def cv90: typingsSlinky.pdfkit.pdfkitStrings.cv90 = "cv90".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv90]
  @scala.inline
  def cv91: typingsSlinky.pdfkit.pdfkitStrings.cv91 = "cv91".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv91]
  @scala.inline
  def cv92: typingsSlinky.pdfkit.pdfkitStrings.cv92 = "cv92".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv92]
  @scala.inline
  def cv93: typingsSlinky.pdfkit.pdfkitStrings.cv93 = "cv93".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv93]
  @scala.inline
  def cv94: typingsSlinky.pdfkit.pdfkitStrings.cv94 = "cv94".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv94]
  @scala.inline
  def cv95: typingsSlinky.pdfkit.pdfkitStrings.cv95 = "cv95".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv95]
  @scala.inline
  def cv96: typingsSlinky.pdfkit.pdfkitStrings.cv96 = "cv96".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv96]
  @scala.inline
  def cv97: typingsSlinky.pdfkit.pdfkitStrings.cv97 = "cv97".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv97]
  @scala.inline
  def cv98: typingsSlinky.pdfkit.pdfkitStrings.cv98 = "cv98".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv98]
  @scala.inline
  def cv99: typingsSlinky.pdfkit.pdfkitStrings.cv99 = "cv99".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv99]
  @scala.inline
  def dist: typingsSlinky.pdfkit.pdfkitStrings.dist = "dist".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.dist]
  @scala.inline
  def dlig: typingsSlinky.pdfkit.pdfkitStrings.dlig = "dlig".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.dlig]
  @scala.inline
  def dnom: typingsSlinky.pdfkit.pdfkitStrings.dnom = "dnom".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.dnom]
  @scala.inline
  def dtls: typingsSlinky.pdfkit.pdfkitStrings.dtls = "dtls".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.dtls]
  @scala.inline
  def expt: typingsSlinky.pdfkit.pdfkitStrings.expt = "expt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.expt]
  @scala.inline
  def falt: typingsSlinky.pdfkit.pdfkitStrings.falt = "falt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.falt]
  @scala.inline
  def fin2: typingsSlinky.pdfkit.pdfkitStrings.fin2 = "fin2".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.fin2]
  @scala.inline
  def fin3: typingsSlinky.pdfkit.pdfkitStrings.fin3 = "fin3".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.fin3]
  @scala.inline
  def fina: typingsSlinky.pdfkit.pdfkitStrings.fina = "fina".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.fina]
  @scala.inline
  def flac: typingsSlinky.pdfkit.pdfkitStrings.flac = "flac".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.flac]
  @scala.inline
  def frac: typingsSlinky.pdfkit.pdfkitStrings.frac = "frac".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.frac]
  @scala.inline
  def fwid: typingsSlinky.pdfkit.pdfkitStrings.fwid = "fwid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.fwid]
  @scala.inline
  def half: typingsSlinky.pdfkit.pdfkitStrings.half = "half".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.half]
  @scala.inline
  def haln: typingsSlinky.pdfkit.pdfkitStrings.haln = "haln".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.haln]
  @scala.inline
  def halt: typingsSlinky.pdfkit.pdfkitStrings.halt = "halt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.halt]
  @scala.inline
  def hist: typingsSlinky.pdfkit.pdfkitStrings.hist = "hist".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hist]
  @scala.inline
  def hkna: typingsSlinky.pdfkit.pdfkitStrings.hkna = "hkna".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hkna]
  @scala.inline
  def hlig: typingsSlinky.pdfkit.pdfkitStrings.hlig = "hlig".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hlig]
  @scala.inline
  def hngl: typingsSlinky.pdfkit.pdfkitStrings.hngl = "hngl".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hngl]
  @scala.inline
  def hojo: typingsSlinky.pdfkit.pdfkitStrings.hojo = "hojo".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hojo]
  @scala.inline
  def hwid: typingsSlinky.pdfkit.pdfkitStrings.hwid = "hwid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hwid]
  @scala.inline
  def init: typingsSlinky.pdfkit.pdfkitStrings.init = "init".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.init]
  @scala.inline
  def isol: typingsSlinky.pdfkit.pdfkitStrings.isol = "isol".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.isol]
  @scala.inline
  def ital: typingsSlinky.pdfkit.pdfkitStrings.ital = "ital".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ital]
  @scala.inline
  def jalt: typingsSlinky.pdfkit.pdfkitStrings.jalt = "jalt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jalt]
  @scala.inline
  def jp04: typingsSlinky.pdfkit.pdfkitStrings.jp04 = "jp04".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jp04]
  @scala.inline
  def jp78: typingsSlinky.pdfkit.pdfkitStrings.jp78 = "jp78".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jp78]
  @scala.inline
  def jp83: typingsSlinky.pdfkit.pdfkitStrings.jp83 = "jp83".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jp83]
  @scala.inline
  def jp90: typingsSlinky.pdfkit.pdfkitStrings.jp90 = "jp90".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jp90]
  @scala.inline
  def kern: typingsSlinky.pdfkit.pdfkitStrings.kern = "kern".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.kern]
  @scala.inline
  def lfbd: typingsSlinky.pdfkit.pdfkitStrings.lfbd = "lfbd".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.lfbd]
  @scala.inline
  def liga: typingsSlinky.pdfkit.pdfkitStrings.liga = "liga".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.liga]
  @scala.inline
  def ljmo: typingsSlinky.pdfkit.pdfkitStrings.ljmo = "ljmo".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ljmo]
  @scala.inline
  def lnum: typingsSlinky.pdfkit.pdfkitStrings.lnum = "lnum".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.lnum]
  @scala.inline
  def locl: typingsSlinky.pdfkit.pdfkitStrings.locl = "locl".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.locl]
  @scala.inline
  def ltra: typingsSlinky.pdfkit.pdfkitStrings.ltra = "ltra".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ltra]
  @scala.inline
  def ltrm: typingsSlinky.pdfkit.pdfkitStrings.ltrm = "ltrm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ltrm]
  @scala.inline
  def mark: typingsSlinky.pdfkit.pdfkitStrings.mark = "mark".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.mark]
  @scala.inline
  def med2: typingsSlinky.pdfkit.pdfkitStrings.med2 = "med2".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.med2]
  @scala.inline
  def medi: typingsSlinky.pdfkit.pdfkitStrings.medi = "medi".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.medi]
  @scala.inline
  def mgrk: typingsSlinky.pdfkit.pdfkitStrings.mgrk = "mgrk".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.mgrk]
  @scala.inline
  def mkmk: typingsSlinky.pdfkit.pdfkitStrings.mkmk = "mkmk".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.mkmk]
  @scala.inline
  def mset: typingsSlinky.pdfkit.pdfkitStrings.mset = "mset".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.mset]
  @scala.inline
  def nalt: typingsSlinky.pdfkit.pdfkitStrings.nalt = "nalt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.nalt]
  @scala.inline
  def nlck: typingsSlinky.pdfkit.pdfkitStrings.nlck = "nlck".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.nlck]
  @scala.inline
  def nukt: typingsSlinky.pdfkit.pdfkitStrings.nukt = "nukt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.nukt]
  @scala.inline
  def numr: typingsSlinky.pdfkit.pdfkitStrings.numr = "numr".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.numr]
  @scala.inline
  def onum: typingsSlinky.pdfkit.pdfkitStrings.onum = "onum".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.onum]
  @scala.inline
  def opbd: typingsSlinky.pdfkit.pdfkitStrings.opbd = "opbd".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.opbd]
  @scala.inline
  def ordn: typingsSlinky.pdfkit.pdfkitStrings.ordn = "ordn".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ordn]
  @scala.inline
  def ornm: typingsSlinky.pdfkit.pdfkitStrings.ornm = "ornm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ornm]
  @scala.inline
  def palt: typingsSlinky.pdfkit.pdfkitStrings.palt = "palt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.palt]
  @scala.inline
  def pcap: typingsSlinky.pdfkit.pdfkitStrings.pcap = "pcap".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pcap]
  @scala.inline
  def pkna: typingsSlinky.pdfkit.pdfkitStrings.pkna = "pkna".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pkna]
  @scala.inline
  def pnum: typingsSlinky.pdfkit.pdfkitStrings.pnum = "pnum".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pnum]
  @scala.inline
  def pref: typingsSlinky.pdfkit.pdfkitStrings.pref = "pref".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pref]
  @scala.inline
  def pres: typingsSlinky.pdfkit.pdfkitStrings.pres = "pres".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pres]
  @scala.inline
  def pstf: typingsSlinky.pdfkit.pdfkitStrings.pstf = "pstf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pstf]
  @scala.inline
  def psts: typingsSlinky.pdfkit.pdfkitStrings.psts = "psts".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.psts]
  @scala.inline
  def pwid: typingsSlinky.pdfkit.pdfkitStrings.pwid = "pwid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pwid]
  @scala.inline
  def qwid: typingsSlinky.pdfkit.pdfkitStrings.qwid = "qwid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.qwid]
  @scala.inline
  def rand: typingsSlinky.pdfkit.pdfkitStrings.rand = "rand".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rand]
  @scala.inline
  def rclt: typingsSlinky.pdfkit.pdfkitStrings.rclt = "rclt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rclt]
  @scala.inline
  def rkrf: typingsSlinky.pdfkit.pdfkitStrings.rkrf = "rkrf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rkrf]
  @scala.inline
  def rlig: typingsSlinky.pdfkit.pdfkitStrings.rlig = "rlig".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rlig]
  @scala.inline
  def rphf: typingsSlinky.pdfkit.pdfkitStrings.rphf = "rphf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rphf]
  @scala.inline
  def rtbd: typingsSlinky.pdfkit.pdfkitStrings.rtbd = "rtbd".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rtbd]
  @scala.inline
  def rtla: typingsSlinky.pdfkit.pdfkitStrings.rtla = "rtla".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rtla]
  @scala.inline
  def rtlm: typingsSlinky.pdfkit.pdfkitStrings.rtlm = "rtlm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rtlm]
  @scala.inline
  def ruby: typingsSlinky.pdfkit.pdfkitStrings.ruby = "ruby".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ruby]
  @scala.inline
  def rvrn: typingsSlinky.pdfkit.pdfkitStrings.rvrn = "rvrn".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rvrn]
  @scala.inline
  def salt: typingsSlinky.pdfkit.pdfkitStrings.salt = "salt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.salt]
  @scala.inline
  def sinf: typingsSlinky.pdfkit.pdfkitStrings.sinf = "sinf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.sinf]
  @scala.inline
  def size: typingsSlinky.pdfkit.pdfkitStrings.size = "size".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.size]
  @scala.inline
  def smcp: typingsSlinky.pdfkit.pdfkitStrings.smcp = "smcp".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.smcp]
  @scala.inline
  def smpl: typingsSlinky.pdfkit.pdfkitStrings.smpl = "smpl".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.smpl]
  @scala.inline
  def ss01: typingsSlinky.pdfkit.pdfkitStrings.ss01 = "ss01".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss01]
  @scala.inline
  def ss02: typingsSlinky.pdfkit.pdfkitStrings.ss02 = "ss02".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss02]
  @scala.inline
  def ss03: typingsSlinky.pdfkit.pdfkitStrings.ss03 = "ss03".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss03]
  @scala.inline
  def ss04: typingsSlinky.pdfkit.pdfkitStrings.ss04 = "ss04".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss04]
  @scala.inline
  def ss05: typingsSlinky.pdfkit.pdfkitStrings.ss05 = "ss05".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss05]
  @scala.inline
  def ss06: typingsSlinky.pdfkit.pdfkitStrings.ss06 = "ss06".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss06]
  @scala.inline
  def ss07: typingsSlinky.pdfkit.pdfkitStrings.ss07 = "ss07".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss07]
  @scala.inline
  def ss08: typingsSlinky.pdfkit.pdfkitStrings.ss08 = "ss08".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss08]
  @scala.inline
  def ss09: typingsSlinky.pdfkit.pdfkitStrings.ss09 = "ss09".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss09]
  @scala.inline
  def ss10: typingsSlinky.pdfkit.pdfkitStrings.ss10 = "ss10".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss10]
  @scala.inline
  def ss11: typingsSlinky.pdfkit.pdfkitStrings.ss11 = "ss11".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss11]
  @scala.inline
  def ss12: typingsSlinky.pdfkit.pdfkitStrings.ss12 = "ss12".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss12]
  @scala.inline
  def ss13: typingsSlinky.pdfkit.pdfkitStrings.ss13 = "ss13".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss13]
  @scala.inline
  def ss14: typingsSlinky.pdfkit.pdfkitStrings.ss14 = "ss14".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss14]
  @scala.inline
  def ss15: typingsSlinky.pdfkit.pdfkitStrings.ss15 = "ss15".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss15]
  @scala.inline
  def ss16: typingsSlinky.pdfkit.pdfkitStrings.ss16 = "ss16".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss16]
  @scala.inline
  def ss17: typingsSlinky.pdfkit.pdfkitStrings.ss17 = "ss17".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss17]
  @scala.inline
  def ss18: typingsSlinky.pdfkit.pdfkitStrings.ss18 = "ss18".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss18]
  @scala.inline
  def ss19: typingsSlinky.pdfkit.pdfkitStrings.ss19 = "ss19".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss19]
  @scala.inline
  def ss20: typingsSlinky.pdfkit.pdfkitStrings.ss20 = "ss20".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss20]
  @scala.inline
  def ssty: typingsSlinky.pdfkit.pdfkitStrings.ssty = "ssty".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ssty]
  @scala.inline
  def stch: typingsSlinky.pdfkit.pdfkitStrings.stch = "stch".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.stch]
  @scala.inline
  def subs: typingsSlinky.pdfkit.pdfkitStrings.subs = "subs".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.subs]
  @scala.inline
  def sups: typingsSlinky.pdfkit.pdfkitStrings.sups = "sups".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.sups]
  @scala.inline
  def swsh: typingsSlinky.pdfkit.pdfkitStrings.swsh = "swsh".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.swsh]
  @scala.inline
  def titl: typingsSlinky.pdfkit.pdfkitStrings.titl = "titl".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.titl]
  @scala.inline
  def tjmo: typingsSlinky.pdfkit.pdfkitStrings.tjmo = "tjmo".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.tjmo]
  @scala.inline
  def tnam: typingsSlinky.pdfkit.pdfkitStrings.tnam = "tnam".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.tnam]
  @scala.inline
  def tnum: typingsSlinky.pdfkit.pdfkitStrings.tnum = "tnum".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.tnum]
  @scala.inline
  def trad: typingsSlinky.pdfkit.pdfkitStrings.trad = "trad".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.trad]
  @scala.inline
  def twid: typingsSlinky.pdfkit.pdfkitStrings.twid = "twid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.twid]
  @scala.inline
  def unic: typingsSlinky.pdfkit.pdfkitStrings.unic = "unic".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.unic]
  @scala.inline
  def valt: typingsSlinky.pdfkit.pdfkitStrings.valt = "valt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.valt]
  @scala.inline
  def vatu: typingsSlinky.pdfkit.pdfkitStrings.vatu = "vatu".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vatu]
  @scala.inline
  def vert: typingsSlinky.pdfkit.pdfkitStrings.vert = "vert".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vert]
  @scala.inline
  def vhal: typingsSlinky.pdfkit.pdfkitStrings.vhal = "vhal".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vhal]
  @scala.inline
  def vjmo: typingsSlinky.pdfkit.pdfkitStrings.vjmo = "vjmo".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vjmo]
  @scala.inline
  def vkna: typingsSlinky.pdfkit.pdfkitStrings.vkna = "vkna".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vkna]
  @scala.inline
  def vkrn: typingsSlinky.pdfkit.pdfkitStrings.vkrn = "vkrn".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vkrn]
  @scala.inline
  def vpal: typingsSlinky.pdfkit.pdfkitStrings.vpal = "vpal".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vpal]
  @scala.inline
  def vrt2: typingsSlinky.pdfkit.pdfkitStrings.vrt2 = "vrt2".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vrt2]
  @scala.inline
  def vrtr: typingsSlinky.pdfkit.pdfkitStrings.vrtr = "vrtr".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vrtr]
  @scala.inline
  def zero: typingsSlinky.pdfkit.pdfkitStrings.zero = "zero".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.zero]
}

