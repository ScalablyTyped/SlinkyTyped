package typingsSlinky.convertUnits.mod

import typingsSlinky.convertUnits.convertUnitsStrings.Gb_
import typingsSlinky.convertUnits.convertUnitsStrings.Kb_
import typingsSlinky.convertUnits.convertUnitsStrings.Mb_
import typingsSlinky.convertUnits.convertUnitsStrings.Tb_
import typingsSlinky.convertUnits.convertUnitsStrings.b_
import typingsSlinky.convertUnits.convertUnitsStrings.km_
import typingsSlinky.convertUnits.convertUnitsStrings.mHz_
import typingsSlinky.convertUnits.convertUnitsStrings.mVAR_
import typingsSlinky.convertUnits.convertUnitsStrings.mVARh_
import typingsSlinky.convertUnits.convertUnitsStrings.mVA_
import typingsSlinky.convertUnits.convertUnitsStrings.mW_
import typingsSlinky.convertUnits.convertUnitsStrings.mWh_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.convertUnits.convertUnitsStrings.mm
  - typingsSlinky.convertUnits.convertUnitsStrings.cm
  - typingsSlinky.convertUnits.convertUnitsStrings.m
  - typingsSlinky.convertUnits.convertUnitsStrings.km_
  - typingsSlinky.convertUnits.convertUnitsStrings.in
  - typingsSlinky.convertUnits.convertUnitsStrings.`ft-us`
  - typingsSlinky.convertUnits.convertUnitsStrings.ft
  - typingsSlinky.convertUnits.convertUnitsStrings.mi
  - typingsSlinky.convertUnits.convertUnitsStrings.mm2
  - typingsSlinky.convertUnits.convertUnitsStrings.cm2
  - typingsSlinky.convertUnits.convertUnitsStrings.m2
  - typingsSlinky.convertUnits.convertUnitsStrings.ha
  - typingsSlinky.convertUnits.convertUnitsStrings.km2
  - typingsSlinky.convertUnits.convertUnitsStrings.in2
  - typingsSlinky.convertUnits.convertUnitsStrings.ft2
  - typingsSlinky.convertUnits.convertUnitsStrings.ac
  - typingsSlinky.convertUnits.convertUnitsStrings.mi2
  - typingsSlinky.convertUnits.convertUnitsStrings.mcg
  - typingsSlinky.convertUnits.convertUnitsStrings.mg
  - typingsSlinky.convertUnits.convertUnitsStrings.g
  - typingsSlinky.convertUnits.convertUnitsStrings.kg
  - typingsSlinky.convertUnits.convertUnitsStrings.oz
  - typingsSlinky.convertUnits.convertUnitsStrings.lb
  - typingsSlinky.convertUnits.convertUnitsStrings.mt
  - typingsSlinky.convertUnits.convertUnitsStrings.t
  - typingsSlinky.convertUnits.convertUnitsStrings.mm3
  - typingsSlinky.convertUnits.convertUnitsStrings.cm3
  - typingsSlinky.convertUnits.convertUnitsStrings.ml
  - typingsSlinky.convertUnits.convertUnitsStrings.l
  - typingsSlinky.convertUnits.convertUnitsStrings.kl
  - typingsSlinky.convertUnits.convertUnitsStrings.m3
  - typingsSlinky.convertUnits.convertUnitsStrings.km3
  - typingsSlinky.convertUnits.convertUnitsStrings.tsp
  - typingsSlinky.convertUnits.convertUnitsStrings.Tbs
  - typingsSlinky.convertUnits.convertUnitsStrings.in3
  - typingsSlinky.convertUnits.convertUnitsStrings.`fl-oz`
  - typingsSlinky.convertUnits.convertUnitsStrings.cup
  - typingsSlinky.convertUnits.convertUnitsStrings.pnt
  - typingsSlinky.convertUnits.convertUnitsStrings.qt
  - typingsSlinky.convertUnits.convertUnitsStrings.gal
  - typingsSlinky.convertUnits.convertUnitsStrings.ft3
  - typingsSlinky.convertUnits.convertUnitsStrings.yd3
  - typingsSlinky.convertUnits.convertUnitsStrings.mm3Slashs
  - typingsSlinky.convertUnits.convertUnitsStrings.cm3Slashs
  - typingsSlinky.convertUnits.convertUnitsStrings.mlSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.clSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.dlSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.lSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.lSlashmin
  - typingsSlinky.convertUnits.convertUnitsStrings.lSlashh
  - typingsSlinky.convertUnits.convertUnitsStrings.klSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.klSlashmin
  - typingsSlinky.convertUnits.convertUnitsStrings.klSlashh
  - typingsSlinky.convertUnits.convertUnitsStrings.m3Slashs
  - typingsSlinky.convertUnits.convertUnitsStrings.m3Slashmin
  - typingsSlinky.convertUnits.convertUnitsStrings.m3Slashh
  - typingsSlinky.convertUnits.convertUnitsStrings.km3Slashs
  - typingsSlinky.convertUnits.convertUnitsStrings.tspSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.TbsSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.in3Slashs
  - typingsSlinky.convertUnits.convertUnitsStrings.in3Slashmin
  - typingsSlinky.convertUnits.convertUnitsStrings.in3Slashh
  - typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashs`
  - typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashmin`
  - typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashh`
  - typingsSlinky.convertUnits.convertUnitsStrings.cupSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.pntSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.pntSlashmin
  - typingsSlinky.convertUnits.convertUnitsStrings.pntSlashh
  - typingsSlinky.convertUnits.convertUnitsStrings.qtSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.galSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.galSlashmin
  - typingsSlinky.convertUnits.convertUnitsStrings.galSlashh
  - typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashs
  - typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashmin
  - typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashh
  - typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashs
  - typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashmin
  - typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashh
  - typingsSlinky.convertUnits.convertUnitsStrings.C
  - typingsSlinky.convertUnits.convertUnitsStrings.F
  - typingsSlinky.convertUnits.convertUnitsStrings.K
  - typingsSlinky.convertUnits.convertUnitsStrings.R
  - typingsSlinky.convertUnits.convertUnitsStrings.ns
  - typingsSlinky.convertUnits.convertUnitsStrings.mu
  - typingsSlinky.convertUnits.convertUnitsStrings.ms
  - typingsSlinky.convertUnits.convertUnitsStrings.s
  - typingsSlinky.convertUnits.convertUnitsStrings.min
  - typingsSlinky.convertUnits.convertUnitsStrings.h
  - typingsSlinky.convertUnits.convertUnitsStrings.d
  - typingsSlinky.convertUnits.convertUnitsStrings.week
  - typingsSlinky.convertUnits.convertUnitsStrings.month
  - typingsSlinky.convertUnits.convertUnitsStrings.year
  - typingsSlinky.convertUnits.convertUnitsStrings.Hz
  - typingsSlinky.convertUnits.convertUnitsStrings.mHz_
  - typingsSlinky.convertUnits.convertUnitsStrings.kHz
  - typingsSlinky.convertUnits.convertUnitsStrings.MHz
  - typingsSlinky.convertUnits.convertUnitsStrings.GHz
  - typingsSlinky.convertUnits.convertUnitsStrings.THz
  - typingsSlinky.convertUnits.convertUnitsStrings.rpm
  - typingsSlinky.convertUnits.convertUnitsStrings.degSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.radSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.mSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.kmSlashh
  - typingsSlinky.convertUnits.convertUnitsStrings.mSlashh
  - typingsSlinky.convertUnits.convertUnitsStrings.knot
  - typingsSlinky.convertUnits.convertUnitsStrings.ftSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.sSlashm
  - typingsSlinky.convertUnits.convertUnitsStrings.minSlashkm
  - typingsSlinky.convertUnits.convertUnitsStrings.sSlashft
  - typingsSlinky.convertUnits.convertUnitsStrings.Pa
  - typingsSlinky.convertUnits.convertUnitsStrings.hPa
  - typingsSlinky.convertUnits.convertUnitsStrings.kPa
  - typingsSlinky.convertUnits.convertUnitsStrings.MPa
  - typingsSlinky.convertUnits.convertUnitsStrings.bar
  - typingsSlinky.convertUnits.convertUnitsStrings.torr
  - typingsSlinky.convertUnits.convertUnitsStrings.psi
  - typingsSlinky.convertUnits.convertUnitsStrings.ksi
  - typingsSlinky.convertUnits.convertUnitsStrings.b_
  - typingsSlinky.convertUnits.convertUnitsStrings.Kb_
  - typingsSlinky.convertUnits.convertUnitsStrings.Mb_
  - typingsSlinky.convertUnits.convertUnitsStrings.Gb_
  - typingsSlinky.convertUnits.convertUnitsStrings.Tb_
  - typingsSlinky.convertUnits.convertUnitsStrings.B
  - typingsSlinky.convertUnits.convertUnitsStrings.KB
  - typingsSlinky.convertUnits.convertUnitsStrings.MB
  - typingsSlinky.convertUnits.convertUnitsStrings.GB
  - typingsSlinky.convertUnits.convertUnitsStrings.TB
  - typingsSlinky.convertUnits.convertUnitsStrings.lx
  - typingsSlinky.convertUnits.convertUnitsStrings.`ft-cd`
  - typingsSlinky.convertUnits.convertUnitsStrings.ppm
  - typingsSlinky.convertUnits.convertUnitsStrings.ppb
  - typingsSlinky.convertUnits.convertUnitsStrings.ppt
  - typingsSlinky.convertUnits.convertUnitsStrings.ppq
  - typingsSlinky.convertUnits.convertUnitsStrings.V
  - typingsSlinky.convertUnits.convertUnitsStrings.mV
  - typingsSlinky.convertUnits.convertUnitsStrings.kV
  - typingsSlinky.convertUnits.convertUnitsStrings.A
  - typingsSlinky.convertUnits.convertUnitsStrings.mA
  - typingsSlinky.convertUnits.convertUnitsStrings.kA
  - typingsSlinky.convertUnits.convertUnitsStrings.W
  - typingsSlinky.convertUnits.convertUnitsStrings.mW_
  - typingsSlinky.convertUnits.convertUnitsStrings.kM
  - typingsSlinky.convertUnits.convertUnitsStrings.MW
  - typingsSlinky.convertUnits.convertUnitsStrings.GW
  - typingsSlinky.convertUnits.convertUnitsStrings.VA
  - typingsSlinky.convertUnits.convertUnitsStrings.mVA_
  - typingsSlinky.convertUnits.convertUnitsStrings.kVA
  - typingsSlinky.convertUnits.convertUnitsStrings.MVA
  - typingsSlinky.convertUnits.convertUnitsStrings.GVA
  - typingsSlinky.convertUnits.convertUnitsStrings.VAR
  - typingsSlinky.convertUnits.convertUnitsStrings.mVAR_
  - typingsSlinky.convertUnits.convertUnitsStrings.kVAR
  - typingsSlinky.convertUnits.convertUnitsStrings.MVAR
  - typingsSlinky.convertUnits.convertUnitsStrings.GVAR
  - typingsSlinky.convertUnits.convertUnitsStrings.Wh
  - typingsSlinky.convertUnits.convertUnitsStrings.mWh_
  - typingsSlinky.convertUnits.convertUnitsStrings.kWh
  - typingsSlinky.convertUnits.convertUnitsStrings.MWh
  - typingsSlinky.convertUnits.convertUnitsStrings.GWh
  - typingsSlinky.convertUnits.convertUnitsStrings.J
  - typingsSlinky.convertUnits.convertUnitsStrings.kJ
  - typingsSlinky.convertUnits.convertUnitsStrings.VARh
  - typingsSlinky.convertUnits.convertUnitsStrings.mVARh_
  - typingsSlinky.convertUnits.convertUnitsStrings.kVARh
  - typingsSlinky.convertUnits.convertUnitsStrings.MVARh
  - typingsSlinky.convertUnits.convertUnitsStrings.GVARH
  - typingsSlinky.convertUnits.convertUnitsStrings.deg
  - typingsSlinky.convertUnits.convertUnitsStrings.rad
  - typingsSlinky.convertUnits.convertUnitsStrings.grad
  - typingsSlinky.convertUnits.convertUnitsStrings.arcmin
  - typingsSlinky.convertUnits.convertUnitsStrings.arcsec
*/
trait unit extends js.Object

object unit {
  @scala.inline
  def A: typingsSlinky.convertUnits.convertUnitsStrings.A = this.cast("A")
  @scala.inline
  def B: typingsSlinky.convertUnits.convertUnitsStrings.B = this.cast("B")
  @scala.inline
  def C: typingsSlinky.convertUnits.convertUnitsStrings.C = this.cast("C")
  @scala.inline
  def F: typingsSlinky.convertUnits.convertUnitsStrings.F = this.cast("F")
  @scala.inline
  def GB: typingsSlinky.convertUnits.convertUnitsStrings.GB = this.cast("GB")
  @scala.inline
  def GHz: typingsSlinky.convertUnits.convertUnitsStrings.GHz = this.cast("GHz")
  @scala.inline
  def GVA: typingsSlinky.convertUnits.convertUnitsStrings.GVA = this.cast("GVA")
  @scala.inline
  def GVAR: typingsSlinky.convertUnits.convertUnitsStrings.GVAR = this.cast("GVAR")
  @scala.inline
  def GVARH: typingsSlinky.convertUnits.convertUnitsStrings.GVARH = this.cast("GVARH")
  @scala.inline
  def GW: typingsSlinky.convertUnits.convertUnitsStrings.GW = this.cast("GW")
  @scala.inline
  def GWh: typingsSlinky.convertUnits.convertUnitsStrings.GWh = this.cast("GWh")
  @scala.inline
  def Gb: Gb_ = this.cast("Gb")
  @scala.inline
  def Hz: typingsSlinky.convertUnits.convertUnitsStrings.Hz = this.cast("Hz")
  @scala.inline
  def J: typingsSlinky.convertUnits.convertUnitsStrings.J = this.cast("J")
  @scala.inline
  def K: typingsSlinky.convertUnits.convertUnitsStrings.K = this.cast("K")
  @scala.inline
  def KB: typingsSlinky.convertUnits.convertUnitsStrings.KB = this.cast("KB")
  @scala.inline
  def Kb: Kb_ = this.cast("Kb")
  @scala.inline
  def MB: typingsSlinky.convertUnits.convertUnitsStrings.MB = this.cast("MB")
  @scala.inline
  def MHz: typingsSlinky.convertUnits.convertUnitsStrings.MHz = this.cast("MHz")
  @scala.inline
  def MPa: typingsSlinky.convertUnits.convertUnitsStrings.MPa = this.cast("MPa")
  @scala.inline
  def MVA: typingsSlinky.convertUnits.convertUnitsStrings.MVA = this.cast("MVA")
  @scala.inline
  def MVAR: typingsSlinky.convertUnits.convertUnitsStrings.MVAR = this.cast("MVAR")
  @scala.inline
  def MVARh: typingsSlinky.convertUnits.convertUnitsStrings.MVARh = this.cast("MVARh")
  @scala.inline
  def MW: typingsSlinky.convertUnits.convertUnitsStrings.MW = this.cast("MW")
  @scala.inline
  def MWh: typingsSlinky.convertUnits.convertUnitsStrings.MWh = this.cast("MWh")
  @scala.inline
  def Mb: Mb_ = this.cast("Mb")
  @scala.inline
  def Pa: typingsSlinky.convertUnits.convertUnitsStrings.Pa = this.cast("Pa")
  @scala.inline
  def R: typingsSlinky.convertUnits.convertUnitsStrings.R = this.cast("R")
  @scala.inline
  def TB: typingsSlinky.convertUnits.convertUnitsStrings.TB = this.cast("TB")
  @scala.inline
  def THz: typingsSlinky.convertUnits.convertUnitsStrings.THz = this.cast("THz")
  @scala.inline
  def Tb: Tb_ = this.cast("Tb")
  @scala.inline
  def Tbs: typingsSlinky.convertUnits.convertUnitsStrings.Tbs = this.cast("Tbs")
  @scala.inline
  def TbsSlashs: typingsSlinky.convertUnits.convertUnitsStrings.TbsSlashs = this.cast("Tbs/s")
  @scala.inline
  def V: typingsSlinky.convertUnits.convertUnitsStrings.V = this.cast("V")
  @scala.inline
  def VA: typingsSlinky.convertUnits.convertUnitsStrings.VA = this.cast("VA")
  @scala.inline
  def VAR: typingsSlinky.convertUnits.convertUnitsStrings.VAR = this.cast("VAR")
  @scala.inline
  def VARh: typingsSlinky.convertUnits.convertUnitsStrings.VARh = this.cast("VARh")
  @scala.inline
  def W: typingsSlinky.convertUnits.convertUnitsStrings.W = this.cast("W")
  @scala.inline
  def Wh: typingsSlinky.convertUnits.convertUnitsStrings.Wh = this.cast("Wh")
  @scala.inline
  def ac: typingsSlinky.convertUnits.convertUnitsStrings.ac = this.cast("ac")
  @scala.inline
  def arcmin: typingsSlinky.convertUnits.convertUnitsStrings.arcmin = this.cast("arcmin")
  @scala.inline
  def arcsec: typingsSlinky.convertUnits.convertUnitsStrings.arcsec = this.cast("arcsec")
  @scala.inline
  def b: b_ = this.cast("b")
  @scala.inline
  def bar: typingsSlinky.convertUnits.convertUnitsStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clSlashs: typingsSlinky.convertUnits.convertUnitsStrings.clSlashs = this.cast("cl/s")
  @scala.inline
  def cm: typingsSlinky.convertUnits.convertUnitsStrings.cm = this.cast("cm")
  @scala.inline
  def cm2: typingsSlinky.convertUnits.convertUnitsStrings.cm2 = this.cast("cm2")
  @scala.inline
  def cm3: typingsSlinky.convertUnits.convertUnitsStrings.cm3 = this.cast("cm3")
  @scala.inline
  def cm3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.cm3Slashs = this.cast("cm3/s")
  @scala.inline
  def cup: typingsSlinky.convertUnits.convertUnitsStrings.cup = this.cast("cup")
  @scala.inline
  def cupSlashs: typingsSlinky.convertUnits.convertUnitsStrings.cupSlashs = this.cast("cup/s")
  @scala.inline
  def d: typingsSlinky.convertUnits.convertUnitsStrings.d = this.cast("d")
  @scala.inline
  def deg: typingsSlinky.convertUnits.convertUnitsStrings.deg = this.cast("deg")
  @scala.inline
  def degSlashs: typingsSlinky.convertUnits.convertUnitsStrings.degSlashs = this.cast("deg/s")
  @scala.inline
  def dlSlashs: typingsSlinky.convertUnits.convertUnitsStrings.dlSlashs = this.cast("dl/s")
  @scala.inline
  def `fl-oz`: typingsSlinky.convertUnits.convertUnitsStrings.`fl-oz` = this.cast("fl-oz")
  @scala.inline
  def `fl-ozSlashh`: typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashh` = this.cast("fl-oz/h")
  @scala.inline
  def `fl-ozSlashmin`: typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashmin` = this.cast("fl-oz/min")
  @scala.inline
  def `fl-ozSlashs`: typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashs` = this.cast("fl-oz/s")
  @scala.inline
  def ft: typingsSlinky.convertUnits.convertUnitsStrings.ft = this.cast("ft")
  @scala.inline
  def `ft-cd`: typingsSlinky.convertUnits.convertUnitsStrings.`ft-cd` = this.cast("ft-cd")
  @scala.inline
  def `ft-us`: typingsSlinky.convertUnits.convertUnitsStrings.`ft-us` = this.cast("ft-us")
  @scala.inline
  def ft2: typingsSlinky.convertUnits.convertUnitsStrings.ft2 = this.cast("ft2")
  @scala.inline
  def ft3: typingsSlinky.convertUnits.convertUnitsStrings.ft3 = this.cast("ft3")
  @scala.inline
  def ft3Slashh: typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashh = this.cast("ft3/h")
  @scala.inline
  def ft3Slashmin: typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashmin = this.cast("ft3/min")
  @scala.inline
  def ft3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashs = this.cast("ft3/s")
  @scala.inline
  def ftSlashs: typingsSlinky.convertUnits.convertUnitsStrings.ftSlashs = this.cast("ft/s")
  @scala.inline
  def g: typingsSlinky.convertUnits.convertUnitsStrings.g = this.cast("g")
  @scala.inline
  def gal: typingsSlinky.convertUnits.convertUnitsStrings.gal = this.cast("gal")
  @scala.inline
  def galSlashh: typingsSlinky.convertUnits.convertUnitsStrings.galSlashh = this.cast("gal/h")
  @scala.inline
  def galSlashmin: typingsSlinky.convertUnits.convertUnitsStrings.galSlashmin = this.cast("gal/min")
  @scala.inline
  def galSlashs: typingsSlinky.convertUnits.convertUnitsStrings.galSlashs = this.cast("gal/s")
  @scala.inline
  def grad: typingsSlinky.convertUnits.convertUnitsStrings.grad = this.cast("grad")
  @scala.inline
  def h: typingsSlinky.convertUnits.convertUnitsStrings.h = this.cast("h")
  @scala.inline
  def hPa: typingsSlinky.convertUnits.convertUnitsStrings.hPa = this.cast("hPa")
  @scala.inline
  def ha: typingsSlinky.convertUnits.convertUnitsStrings.ha = this.cast("ha")
  @scala.inline
  def in: typingsSlinky.convertUnits.convertUnitsStrings.in = this.cast("in")
  @scala.inline
  def in2: typingsSlinky.convertUnits.convertUnitsStrings.in2 = this.cast("in2")
  @scala.inline
  def in3: typingsSlinky.convertUnits.convertUnitsStrings.in3 = this.cast("in3")
  @scala.inline
  def in3Slashh: typingsSlinky.convertUnits.convertUnitsStrings.in3Slashh = this.cast("in3/h")
  @scala.inline
  def in3Slashmin: typingsSlinky.convertUnits.convertUnitsStrings.in3Slashmin = this.cast("in3/min")
  @scala.inline
  def in3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.in3Slashs = this.cast("in3/s")
  @scala.inline
  def kA: typingsSlinky.convertUnits.convertUnitsStrings.kA = this.cast("kA")
  @scala.inline
  def kHz: typingsSlinky.convertUnits.convertUnitsStrings.kHz = this.cast("kHz")
  @scala.inline
  def kJ: typingsSlinky.convertUnits.convertUnitsStrings.kJ = this.cast("kJ")
  @scala.inline
  def kM: typingsSlinky.convertUnits.convertUnitsStrings.kM = this.cast("kM")
  @scala.inline
  def kPa: typingsSlinky.convertUnits.convertUnitsStrings.kPa = this.cast("kPa")
  @scala.inline
  def kV: typingsSlinky.convertUnits.convertUnitsStrings.kV = this.cast("kV")
  @scala.inline
  def kVA: typingsSlinky.convertUnits.convertUnitsStrings.kVA = this.cast("kVA")
  @scala.inline
  def kVAR: typingsSlinky.convertUnits.convertUnitsStrings.kVAR = this.cast("kVAR")
  @scala.inline
  def kVARh: typingsSlinky.convertUnits.convertUnitsStrings.kVARh = this.cast("kVARh")
  @scala.inline
  def kWh: typingsSlinky.convertUnits.convertUnitsStrings.kWh = this.cast("kWh")
  @scala.inline
  def kg: typingsSlinky.convertUnits.convertUnitsStrings.kg = this.cast("kg")
  @scala.inline
  def kl: typingsSlinky.convertUnits.convertUnitsStrings.kl = this.cast("kl")
  @scala.inline
  def klSlashh: typingsSlinky.convertUnits.convertUnitsStrings.klSlashh = this.cast("kl/h")
  @scala.inline
  def klSlashmin: typingsSlinky.convertUnits.convertUnitsStrings.klSlashmin = this.cast("kl/min")
  @scala.inline
  def klSlashs: typingsSlinky.convertUnits.convertUnitsStrings.klSlashs = this.cast("kl/s")
  @scala.inline
  def km: km_ = this.cast("km")
  @scala.inline
  def km2: typingsSlinky.convertUnits.convertUnitsStrings.km2 = this.cast("km2")
  @scala.inline
  def km3: typingsSlinky.convertUnits.convertUnitsStrings.km3 = this.cast("km3")
  @scala.inline
  def km3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.km3Slashs = this.cast("km3/s")
  @scala.inline
  def kmSlashh: typingsSlinky.convertUnits.convertUnitsStrings.kmSlashh = this.cast("km/h")
  @scala.inline
  def knot: typingsSlinky.convertUnits.convertUnitsStrings.knot = this.cast("knot")
  @scala.inline
  def ksi: typingsSlinky.convertUnits.convertUnitsStrings.ksi = this.cast("ksi")
  @scala.inline
  def l: typingsSlinky.convertUnits.convertUnitsStrings.l = this.cast("l")
  @scala.inline
  def lSlashh: typingsSlinky.convertUnits.convertUnitsStrings.lSlashh = this.cast("l/h")
  @scala.inline
  def lSlashmin: typingsSlinky.convertUnits.convertUnitsStrings.lSlashmin = this.cast("l/min")
  @scala.inline
  def lSlashs: typingsSlinky.convertUnits.convertUnitsStrings.lSlashs = this.cast("l/s")
  @scala.inline
  def lb: typingsSlinky.convertUnits.convertUnitsStrings.lb = this.cast("lb")
  @scala.inline
  def lx: typingsSlinky.convertUnits.convertUnitsStrings.lx = this.cast("lx")
  @scala.inline
  def m: typingsSlinky.convertUnits.convertUnitsStrings.m = this.cast("m")
  @scala.inline
  def m2: typingsSlinky.convertUnits.convertUnitsStrings.m2 = this.cast("m2")
  @scala.inline
  def m3: typingsSlinky.convertUnits.convertUnitsStrings.m3 = this.cast("m3")
  @scala.inline
  def m3Slashh: typingsSlinky.convertUnits.convertUnitsStrings.m3Slashh = this.cast("m3/h")
  @scala.inline
  def m3Slashmin: typingsSlinky.convertUnits.convertUnitsStrings.m3Slashmin = this.cast("m3/min")
  @scala.inline
  def m3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.m3Slashs = this.cast("m3/s")
  @scala.inline
  def mA: typingsSlinky.convertUnits.convertUnitsStrings.mA = this.cast("mA")
  @scala.inline
  def mHz: mHz_ = this.cast("mHz")
  @scala.inline
  def mSlashh: typingsSlinky.convertUnits.convertUnitsStrings.mSlashh = this.cast("m/h")
  @scala.inline
  def mSlashs: typingsSlinky.convertUnits.convertUnitsStrings.mSlashs = this.cast("m/s")
  @scala.inline
  def mV: typingsSlinky.convertUnits.convertUnitsStrings.mV = this.cast("mV")
  @scala.inline
  def mVA: mVA_ = this.cast("mVA")
  @scala.inline
  def mVAR: mVAR_ = this.cast("mVAR")
  @scala.inline
  def mVARh: mVARh_ = this.cast("mVARh")
  @scala.inline
  def mW: mW_ = this.cast("mW")
  @scala.inline
  def mWh: mWh_ = this.cast("mWh")
  @scala.inline
  def mcg: typingsSlinky.convertUnits.convertUnitsStrings.mcg = this.cast("mcg")
  @scala.inline
  def mg: typingsSlinky.convertUnits.convertUnitsStrings.mg = this.cast("mg")
  @scala.inline
  def mi: typingsSlinky.convertUnits.convertUnitsStrings.mi = this.cast("mi")
  @scala.inline
  def mi2: typingsSlinky.convertUnits.convertUnitsStrings.mi2 = this.cast("mi2")
  @scala.inline
  def min: typingsSlinky.convertUnits.convertUnitsStrings.min = this.cast("min")
  @scala.inline
  def minSlashkm: typingsSlinky.convertUnits.convertUnitsStrings.minSlashkm = this.cast("min/km")
  @scala.inline
  def ml: typingsSlinky.convertUnits.convertUnitsStrings.ml = this.cast("ml")
  @scala.inline
  def mlSlashs: typingsSlinky.convertUnits.convertUnitsStrings.mlSlashs = this.cast("ml/s")
  @scala.inline
  def mm: typingsSlinky.convertUnits.convertUnitsStrings.mm = this.cast("mm")
  @scala.inline
  def mm2: typingsSlinky.convertUnits.convertUnitsStrings.mm2 = this.cast("mm2")
  @scala.inline
  def mm3: typingsSlinky.convertUnits.convertUnitsStrings.mm3 = this.cast("mm3")
  @scala.inline
  def mm3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.mm3Slashs = this.cast("mm3/s")
  @scala.inline
  def month: typingsSlinky.convertUnits.convertUnitsStrings.month = this.cast("month")
  @scala.inline
  def ms: typingsSlinky.convertUnits.convertUnitsStrings.ms = this.cast("ms")
  @scala.inline
  def mt: typingsSlinky.convertUnits.convertUnitsStrings.mt = this.cast("mt")
  @scala.inline
  def mu: typingsSlinky.convertUnits.convertUnitsStrings.mu = this.cast("mu")
  @scala.inline
  def ns: typingsSlinky.convertUnits.convertUnitsStrings.ns = this.cast("ns")
  @scala.inline
  def oz: typingsSlinky.convertUnits.convertUnitsStrings.oz = this.cast("oz")
  @scala.inline
  def pnt: typingsSlinky.convertUnits.convertUnitsStrings.pnt = this.cast("pnt")
  @scala.inline
  def pntSlashh: typingsSlinky.convertUnits.convertUnitsStrings.pntSlashh = this.cast("pnt/h")
  @scala.inline
  def pntSlashmin: typingsSlinky.convertUnits.convertUnitsStrings.pntSlashmin = this.cast("pnt/min")
  @scala.inline
  def pntSlashs: typingsSlinky.convertUnits.convertUnitsStrings.pntSlashs = this.cast("pnt/s")
  @scala.inline
  def ppb: typingsSlinky.convertUnits.convertUnitsStrings.ppb = this.cast("ppb")
  @scala.inline
  def ppm: typingsSlinky.convertUnits.convertUnitsStrings.ppm = this.cast("ppm")
  @scala.inline
  def ppq: typingsSlinky.convertUnits.convertUnitsStrings.ppq = this.cast("ppq")
  @scala.inline
  def ppt: typingsSlinky.convertUnits.convertUnitsStrings.ppt = this.cast("ppt")
  @scala.inline
  def psi: typingsSlinky.convertUnits.convertUnitsStrings.psi = this.cast("psi")
  @scala.inline
  def qt: typingsSlinky.convertUnits.convertUnitsStrings.qt = this.cast("qt")
  @scala.inline
  def qtSlashs: typingsSlinky.convertUnits.convertUnitsStrings.qtSlashs = this.cast("qt/s")
  @scala.inline
  def rad: typingsSlinky.convertUnits.convertUnitsStrings.rad = this.cast("rad")
  @scala.inline
  def radSlashs: typingsSlinky.convertUnits.convertUnitsStrings.radSlashs = this.cast("rad/s")
  @scala.inline
  def rpm: typingsSlinky.convertUnits.convertUnitsStrings.rpm = this.cast("rpm")
  @scala.inline
  def s: typingsSlinky.convertUnits.convertUnitsStrings.s = this.cast("s")
  @scala.inline
  def sSlashft: typingsSlinky.convertUnits.convertUnitsStrings.sSlashft = this.cast("s/ft")
  @scala.inline
  def sSlashm: typingsSlinky.convertUnits.convertUnitsStrings.sSlashm = this.cast("s/m")
  @scala.inline
  def t: typingsSlinky.convertUnits.convertUnitsStrings.t = this.cast("t")
  @scala.inline
  def torr: typingsSlinky.convertUnits.convertUnitsStrings.torr = this.cast("torr")
  @scala.inline
  def tsp: typingsSlinky.convertUnits.convertUnitsStrings.tsp = this.cast("tsp")
  @scala.inline
  def tspSlashs: typingsSlinky.convertUnits.convertUnitsStrings.tspSlashs = this.cast("tsp/s")
  @scala.inline
  def week: typingsSlinky.convertUnits.convertUnitsStrings.week = this.cast("week")
  @scala.inline
  def yd3: typingsSlinky.convertUnits.convertUnitsStrings.yd3 = this.cast("yd3")
  @scala.inline
  def yd3Slashh: typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashh = this.cast("yd3/h")
  @scala.inline
  def yd3Slashmin: typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashmin = this.cast("yd3/min")
  @scala.inline
  def yd3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashs = this.cast("yd3/s")
  @scala.inline
  def year: typingsSlinky.convertUnits.convertUnitsStrings.year = this.cast("year")
}

