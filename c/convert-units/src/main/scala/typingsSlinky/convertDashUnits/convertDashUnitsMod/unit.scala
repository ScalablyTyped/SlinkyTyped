package typingsSlinky.convertDashUnits.convertDashUnitsMod

import typingsSlinky.convertDashUnits.convertDashUnitsStrings.Gb_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.Kb_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.Mb_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.Tb_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.b_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.km_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.mHz_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.mVAR_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.mVARh_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.mVA_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.mW_
import typingsSlinky.convertDashUnits.convertDashUnitsStrings.mWh_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertDashUnits.convertDashUnitsStrings.mm
  - typings.convertDashUnits.convertDashUnitsStrings.cm
  - typings.convertDashUnits.convertDashUnitsStrings.m
  - typings.convertDashUnits.convertDashUnitsStrings.km_
  - typings.convertDashUnits.convertDashUnitsStrings.in
  - typings.convertDashUnits.convertDashUnitsStrings.`ft-us`
  - typings.convertDashUnits.convertDashUnitsStrings.ft
  - typings.convertDashUnits.convertDashUnitsStrings.mi
  - typings.convertDashUnits.convertDashUnitsStrings.mm2
  - typings.convertDashUnits.convertDashUnitsStrings.cm2
  - typings.convertDashUnits.convertDashUnitsStrings.m2
  - typings.convertDashUnits.convertDashUnitsStrings.ha
  - typings.convertDashUnits.convertDashUnitsStrings.km2
  - typings.convertDashUnits.convertDashUnitsStrings.in2
  - typings.convertDashUnits.convertDashUnitsStrings.ft2
  - typings.convertDashUnits.convertDashUnitsStrings.ac
  - typings.convertDashUnits.convertDashUnitsStrings.mi2
  - typings.convertDashUnits.convertDashUnitsStrings.mcg
  - typings.convertDashUnits.convertDashUnitsStrings.mg
  - typings.convertDashUnits.convertDashUnitsStrings.g
  - typings.convertDashUnits.convertDashUnitsStrings.kg
  - typings.convertDashUnits.convertDashUnitsStrings.oz
  - typings.convertDashUnits.convertDashUnitsStrings.lb
  - typings.convertDashUnits.convertDashUnitsStrings.mt
  - typings.convertDashUnits.convertDashUnitsStrings.t
  - typings.convertDashUnits.convertDashUnitsStrings.mm3
  - typings.convertDashUnits.convertDashUnitsStrings.cm3
  - typings.convertDashUnits.convertDashUnitsStrings.ml
  - typings.convertDashUnits.convertDashUnitsStrings.l
  - typings.convertDashUnits.convertDashUnitsStrings.kl
  - typings.convertDashUnits.convertDashUnitsStrings.m3
  - typings.convertDashUnits.convertDashUnitsStrings.km3
  - typings.convertDashUnits.convertDashUnitsStrings.tsp
  - typings.convertDashUnits.convertDashUnitsStrings.Tbs
  - typings.convertDashUnits.convertDashUnitsStrings.in3
  - typings.convertDashUnits.convertDashUnitsStrings.`fl-oz`
  - typings.convertDashUnits.convertDashUnitsStrings.cup
  - typings.convertDashUnits.convertDashUnitsStrings.pnt
  - typings.convertDashUnits.convertDashUnitsStrings.qt
  - typings.convertDashUnits.convertDashUnitsStrings.gal
  - typings.convertDashUnits.convertDashUnitsStrings.ft3
  - typings.convertDashUnits.convertDashUnitsStrings.yd3
  - typings.convertDashUnits.convertDashUnitsStrings.mm3Slashs
  - typings.convertDashUnits.convertDashUnitsStrings.cm3Slashs
  - typings.convertDashUnits.convertDashUnitsStrings.mlSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.clSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.dlSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.lSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.lSlashmin
  - typings.convertDashUnits.convertDashUnitsStrings.lSlashh
  - typings.convertDashUnits.convertDashUnitsStrings.klSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.klSlashmin
  - typings.convertDashUnits.convertDashUnitsStrings.klSlashh
  - typings.convertDashUnits.convertDashUnitsStrings.m3Slashs
  - typings.convertDashUnits.convertDashUnitsStrings.m3Slashmin
  - typings.convertDashUnits.convertDashUnitsStrings.m3Slashh
  - typings.convertDashUnits.convertDashUnitsStrings.km3Slashs
  - typings.convertDashUnits.convertDashUnitsStrings.tspSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.TbsSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.in3Slashs
  - typings.convertDashUnits.convertDashUnitsStrings.in3Slashmin
  - typings.convertDashUnits.convertDashUnitsStrings.in3Slashh
  - typings.convertDashUnits.convertDashUnitsStrings.`fl-ozSlashs`
  - typings.convertDashUnits.convertDashUnitsStrings.`fl-ozSlashmin`
  - typings.convertDashUnits.convertDashUnitsStrings.`fl-ozSlashh`
  - typings.convertDashUnits.convertDashUnitsStrings.cupSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.pntSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.pntSlashmin
  - typings.convertDashUnits.convertDashUnitsStrings.pntSlashh
  - typings.convertDashUnits.convertDashUnitsStrings.qtSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.galSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.galSlashmin
  - typings.convertDashUnits.convertDashUnitsStrings.galSlashh
  - typings.convertDashUnits.convertDashUnitsStrings.ft3Slashs
  - typings.convertDashUnits.convertDashUnitsStrings.ft3Slashmin
  - typings.convertDashUnits.convertDashUnitsStrings.ft3Slashh
  - typings.convertDashUnits.convertDashUnitsStrings.yd3Slashs
  - typings.convertDashUnits.convertDashUnitsStrings.yd3Slashmin
  - typings.convertDashUnits.convertDashUnitsStrings.yd3Slashh
  - typings.convertDashUnits.convertDashUnitsStrings.C
  - typings.convertDashUnits.convertDashUnitsStrings.F
  - typings.convertDashUnits.convertDashUnitsStrings.K
  - typings.convertDashUnits.convertDashUnitsStrings.R
  - typings.convertDashUnits.convertDashUnitsStrings.ns
  - typings.convertDashUnits.convertDashUnitsStrings.mu
  - typings.convertDashUnits.convertDashUnitsStrings.ms
  - typings.convertDashUnits.convertDashUnitsStrings.s
  - typings.convertDashUnits.convertDashUnitsStrings.min
  - typings.convertDashUnits.convertDashUnitsStrings.h
  - typings.convertDashUnits.convertDashUnitsStrings.d
  - typings.convertDashUnits.convertDashUnitsStrings.week
  - typings.convertDashUnits.convertDashUnitsStrings.month
  - typings.convertDashUnits.convertDashUnitsStrings.year
  - typings.convertDashUnits.convertDashUnitsStrings.Hz
  - typings.convertDashUnits.convertDashUnitsStrings.mHz_
  - typings.convertDashUnits.convertDashUnitsStrings.kHz
  - typings.convertDashUnits.convertDashUnitsStrings.MHz
  - typings.convertDashUnits.convertDashUnitsStrings.GHz
  - typings.convertDashUnits.convertDashUnitsStrings.THz
  - typings.convertDashUnits.convertDashUnitsStrings.rpm
  - typings.convertDashUnits.convertDashUnitsStrings.degSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.radSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.mSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.kmSlashh
  - typings.convertDashUnits.convertDashUnitsStrings.mSlashh
  - typings.convertDashUnits.convertDashUnitsStrings.knot
  - typings.convertDashUnits.convertDashUnitsStrings.ftSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.sSlashm
  - typings.convertDashUnits.convertDashUnitsStrings.minSlashkm
  - typings.convertDashUnits.convertDashUnitsStrings.sSlashft
  - typings.convertDashUnits.convertDashUnitsStrings.Pa
  - typings.convertDashUnits.convertDashUnitsStrings.hPa
  - typings.convertDashUnits.convertDashUnitsStrings.kPa
  - typings.convertDashUnits.convertDashUnitsStrings.MPa
  - typings.convertDashUnits.convertDashUnitsStrings.bar
  - typings.convertDashUnits.convertDashUnitsStrings.torr
  - typings.convertDashUnits.convertDashUnitsStrings.psi
  - typings.convertDashUnits.convertDashUnitsStrings.ksi
  - typings.convertDashUnits.convertDashUnitsStrings.b_
  - typings.convertDashUnits.convertDashUnitsStrings.Kb_
  - typings.convertDashUnits.convertDashUnitsStrings.Mb_
  - typings.convertDashUnits.convertDashUnitsStrings.Gb_
  - typings.convertDashUnits.convertDashUnitsStrings.Tb_
  - typings.convertDashUnits.convertDashUnitsStrings.B
  - typings.convertDashUnits.convertDashUnitsStrings.KB
  - typings.convertDashUnits.convertDashUnitsStrings.MB
  - typings.convertDashUnits.convertDashUnitsStrings.GB
  - typings.convertDashUnits.convertDashUnitsStrings.TB
  - typings.convertDashUnits.convertDashUnitsStrings.lx
  - typings.convertDashUnits.convertDashUnitsStrings.`ft-cd`
  - typings.convertDashUnits.convertDashUnitsStrings.ppm
  - typings.convertDashUnits.convertDashUnitsStrings.ppb
  - typings.convertDashUnits.convertDashUnitsStrings.ppt
  - typings.convertDashUnits.convertDashUnitsStrings.ppq
  - typings.convertDashUnits.convertDashUnitsStrings.V
  - typings.convertDashUnits.convertDashUnitsStrings.mV
  - typings.convertDashUnits.convertDashUnitsStrings.kV
  - typings.convertDashUnits.convertDashUnitsStrings.A
  - typings.convertDashUnits.convertDashUnitsStrings.mA
  - typings.convertDashUnits.convertDashUnitsStrings.kA
  - typings.convertDashUnits.convertDashUnitsStrings.W
  - typings.convertDashUnits.convertDashUnitsStrings.mW_
  - typings.convertDashUnits.convertDashUnitsStrings.kM
  - typings.convertDashUnits.convertDashUnitsStrings.MW
  - typings.convertDashUnits.convertDashUnitsStrings.GW
  - typings.convertDashUnits.convertDashUnitsStrings.VA
  - typings.convertDashUnits.convertDashUnitsStrings.mVA_
  - typings.convertDashUnits.convertDashUnitsStrings.kVA
  - typings.convertDashUnits.convertDashUnitsStrings.MVA
  - typings.convertDashUnits.convertDashUnitsStrings.GVA
  - typings.convertDashUnits.convertDashUnitsStrings.VAR
  - typings.convertDashUnits.convertDashUnitsStrings.mVAR_
  - typings.convertDashUnits.convertDashUnitsStrings.kVAR
  - typings.convertDashUnits.convertDashUnitsStrings.MVAR
  - typings.convertDashUnits.convertDashUnitsStrings.GVAR
  - typings.convertDashUnits.convertDashUnitsStrings.Wh
  - typings.convertDashUnits.convertDashUnitsStrings.mWh_
  - typings.convertDashUnits.convertDashUnitsStrings.kWh
  - typings.convertDashUnits.convertDashUnitsStrings.MWh
  - typings.convertDashUnits.convertDashUnitsStrings.GWh
  - typings.convertDashUnits.convertDashUnitsStrings.J
  - typings.convertDashUnits.convertDashUnitsStrings.kJ
  - typings.convertDashUnits.convertDashUnitsStrings.VARh
  - typings.convertDashUnits.convertDashUnitsStrings.mVARh_
  - typings.convertDashUnits.convertDashUnitsStrings.kVARh
  - typings.convertDashUnits.convertDashUnitsStrings.MVARh
  - typings.convertDashUnits.convertDashUnitsStrings.GVARH
  - typings.convertDashUnits.convertDashUnitsStrings.deg
  - typings.convertDashUnits.convertDashUnitsStrings.rad
  - typings.convertDashUnits.convertDashUnitsStrings.grad
  - typings.convertDashUnits.convertDashUnitsStrings.arcmin
  - typings.convertDashUnits.convertDashUnitsStrings.arcsec
*/
trait unit extends js.Object

object unit {
  @scala.inline
  def A: typingsSlinky.convertDashUnits.convertDashUnitsStrings.A = this.cast("A")
  @scala.inline
  def B: typingsSlinky.convertDashUnits.convertDashUnitsStrings.B = this.cast("B")
  @scala.inline
  def C: typingsSlinky.convertDashUnits.convertDashUnitsStrings.C = this.cast("C")
  @scala.inline
  def F: typingsSlinky.convertDashUnits.convertDashUnitsStrings.F = this.cast("F")
  @scala.inline
  def GB: typingsSlinky.convertDashUnits.convertDashUnitsStrings.GB = this.cast("GB")
  @scala.inline
  def GHz: typingsSlinky.convertDashUnits.convertDashUnitsStrings.GHz = this.cast("GHz")
  @scala.inline
  def GVA: typingsSlinky.convertDashUnits.convertDashUnitsStrings.GVA = this.cast("GVA")
  @scala.inline
  def GVAR: typingsSlinky.convertDashUnits.convertDashUnitsStrings.GVAR = this.cast("GVAR")
  @scala.inline
  def GVARH: typingsSlinky.convertDashUnits.convertDashUnitsStrings.GVARH = this.cast("GVARH")
  @scala.inline
  def GW: typingsSlinky.convertDashUnits.convertDashUnitsStrings.GW = this.cast("GW")
  @scala.inline
  def GWh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.GWh = this.cast("GWh")
  @scala.inline
  def Gb: Gb_ = this.cast("Gb")
  @scala.inline
  def Hz: typingsSlinky.convertDashUnits.convertDashUnitsStrings.Hz = this.cast("Hz")
  @scala.inline
  def J: typingsSlinky.convertDashUnits.convertDashUnitsStrings.J = this.cast("J")
  @scala.inline
  def K: typingsSlinky.convertDashUnits.convertDashUnitsStrings.K = this.cast("K")
  @scala.inline
  def KB: typingsSlinky.convertDashUnits.convertDashUnitsStrings.KB = this.cast("KB")
  @scala.inline
  def Kb: Kb_ = this.cast("Kb")
  @scala.inline
  def MB: typingsSlinky.convertDashUnits.convertDashUnitsStrings.MB = this.cast("MB")
  @scala.inline
  def MHz: typingsSlinky.convertDashUnits.convertDashUnitsStrings.MHz = this.cast("MHz")
  @scala.inline
  def MPa: typingsSlinky.convertDashUnits.convertDashUnitsStrings.MPa = this.cast("MPa")
  @scala.inline
  def MVA: typingsSlinky.convertDashUnits.convertDashUnitsStrings.MVA = this.cast("MVA")
  @scala.inline
  def MVAR: typingsSlinky.convertDashUnits.convertDashUnitsStrings.MVAR = this.cast("MVAR")
  @scala.inline
  def MVARh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.MVARh = this.cast("MVARh")
  @scala.inline
  def MW: typingsSlinky.convertDashUnits.convertDashUnitsStrings.MW = this.cast("MW")
  @scala.inline
  def MWh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.MWh = this.cast("MWh")
  @scala.inline
  def Mb: Mb_ = this.cast("Mb")
  @scala.inline
  def Pa: typingsSlinky.convertDashUnits.convertDashUnitsStrings.Pa = this.cast("Pa")
  @scala.inline
  def R: typingsSlinky.convertDashUnits.convertDashUnitsStrings.R = this.cast("R")
  @scala.inline
  def TB: typingsSlinky.convertDashUnits.convertDashUnitsStrings.TB = this.cast("TB")
  @scala.inline
  def THz: typingsSlinky.convertDashUnits.convertDashUnitsStrings.THz = this.cast("THz")
  @scala.inline
  def Tb: Tb_ = this.cast("Tb")
  @scala.inline
  def Tbs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.Tbs = this.cast("Tbs")
  @scala.inline
  def TbsSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.TbsSlashs = this.cast("Tbs/s")
  @scala.inline
  def V: typingsSlinky.convertDashUnits.convertDashUnitsStrings.V = this.cast("V")
  @scala.inline
  def VA: typingsSlinky.convertDashUnits.convertDashUnitsStrings.VA = this.cast("VA")
  @scala.inline
  def VAR: typingsSlinky.convertDashUnits.convertDashUnitsStrings.VAR = this.cast("VAR")
  @scala.inline
  def VARh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.VARh = this.cast("VARh")
  @scala.inline
  def W: typingsSlinky.convertDashUnits.convertDashUnitsStrings.W = this.cast("W")
  @scala.inline
  def Wh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.Wh = this.cast("Wh")
  @scala.inline
  def ac: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ac = this.cast("ac")
  @scala.inline
  def arcmin: typingsSlinky.convertDashUnits.convertDashUnitsStrings.arcmin = this.cast("arcmin")
  @scala.inline
  def arcsec: typingsSlinky.convertDashUnits.convertDashUnitsStrings.arcsec = this.cast("arcsec")
  @scala.inline
  def b: b_ = this.cast("b")
  @scala.inline
  def bar: typingsSlinky.convertDashUnits.convertDashUnitsStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.clSlashs = this.cast("cl/s")
  @scala.inline
  def cm: typingsSlinky.convertDashUnits.convertDashUnitsStrings.cm = this.cast("cm")
  @scala.inline
  def cm2: typingsSlinky.convertDashUnits.convertDashUnitsStrings.cm2 = this.cast("cm2")
  @scala.inline
  def cm3: typingsSlinky.convertDashUnits.convertDashUnitsStrings.cm3 = this.cast("cm3")
  @scala.inline
  def cm3Slashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.cm3Slashs = this.cast("cm3/s")
  @scala.inline
  def cup: typingsSlinky.convertDashUnits.convertDashUnitsStrings.cup = this.cast("cup")
  @scala.inline
  def cupSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.cupSlashs = this.cast("cup/s")
  @scala.inline
  def d: typingsSlinky.convertDashUnits.convertDashUnitsStrings.d = this.cast("d")
  @scala.inline
  def deg: typingsSlinky.convertDashUnits.convertDashUnitsStrings.deg = this.cast("deg")
  @scala.inline
  def degSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.degSlashs = this.cast("deg/s")
  @scala.inline
  def dlSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.dlSlashs = this.cast("dl/s")
  @scala.inline
  def `fl-oz`: typingsSlinky.convertDashUnits.convertDashUnitsStrings.`fl-oz` = this.cast("fl-oz")
  @scala.inline
  def `fl-ozSlashh`: typingsSlinky.convertDashUnits.convertDashUnitsStrings.`fl-ozSlashh` = this.cast("fl-oz/h")
  @scala.inline
  def `fl-ozSlashmin`: typingsSlinky.convertDashUnits.convertDashUnitsStrings.`fl-ozSlashmin` = this.cast("fl-oz/min")
  @scala.inline
  def `fl-ozSlashs`: typingsSlinky.convertDashUnits.convertDashUnitsStrings.`fl-ozSlashs` = this.cast("fl-oz/s")
  @scala.inline
  def ft: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ft = this.cast("ft")
  @scala.inline
  def `ft-cd`: typingsSlinky.convertDashUnits.convertDashUnitsStrings.`ft-cd` = this.cast("ft-cd")
  @scala.inline
  def `ft-us`: typingsSlinky.convertDashUnits.convertDashUnitsStrings.`ft-us` = this.cast("ft-us")
  @scala.inline
  def ft2: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ft2 = this.cast("ft2")
  @scala.inline
  def ft3: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ft3 = this.cast("ft3")
  @scala.inline
  def ft3Slashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ft3Slashh = this.cast("ft3/h")
  @scala.inline
  def ft3Slashmin: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ft3Slashmin = this.cast("ft3/min")
  @scala.inline
  def ft3Slashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ft3Slashs = this.cast("ft3/s")
  @scala.inline
  def ftSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ftSlashs = this.cast("ft/s")
  @scala.inline
  def g: typingsSlinky.convertDashUnits.convertDashUnitsStrings.g = this.cast("g")
  @scala.inline
  def gal: typingsSlinky.convertDashUnits.convertDashUnitsStrings.gal = this.cast("gal")
  @scala.inline
  def galSlashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.galSlashh = this.cast("gal/h")
  @scala.inline
  def galSlashmin: typingsSlinky.convertDashUnits.convertDashUnitsStrings.galSlashmin = this.cast("gal/min")
  @scala.inline
  def galSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.galSlashs = this.cast("gal/s")
  @scala.inline
  def grad: typingsSlinky.convertDashUnits.convertDashUnitsStrings.grad = this.cast("grad")
  @scala.inline
  def h: typingsSlinky.convertDashUnits.convertDashUnitsStrings.h = this.cast("h")
  @scala.inline
  def hPa: typingsSlinky.convertDashUnits.convertDashUnitsStrings.hPa = this.cast("hPa")
  @scala.inline
  def ha: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ha = this.cast("ha")
  @scala.inline
  def in: typingsSlinky.convertDashUnits.convertDashUnitsStrings.in = this.cast("in")
  @scala.inline
  def in2: typingsSlinky.convertDashUnits.convertDashUnitsStrings.in2 = this.cast("in2")
  @scala.inline
  def in3: typingsSlinky.convertDashUnits.convertDashUnitsStrings.in3 = this.cast("in3")
  @scala.inline
  def in3Slashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.in3Slashh = this.cast("in3/h")
  @scala.inline
  def in3Slashmin: typingsSlinky.convertDashUnits.convertDashUnitsStrings.in3Slashmin = this.cast("in3/min")
  @scala.inline
  def in3Slashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.in3Slashs = this.cast("in3/s")
  @scala.inline
  def kA: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kA = this.cast("kA")
  @scala.inline
  def kHz: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kHz = this.cast("kHz")
  @scala.inline
  def kJ: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kJ = this.cast("kJ")
  @scala.inline
  def kM: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kM = this.cast("kM")
  @scala.inline
  def kPa: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kPa = this.cast("kPa")
  @scala.inline
  def kV: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kV = this.cast("kV")
  @scala.inline
  def kVA: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kVA = this.cast("kVA")
  @scala.inline
  def kVAR: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kVAR = this.cast("kVAR")
  @scala.inline
  def kVARh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kVARh = this.cast("kVARh")
  @scala.inline
  def kWh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kWh = this.cast("kWh")
  @scala.inline
  def kg: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kg = this.cast("kg")
  @scala.inline
  def kl: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kl = this.cast("kl")
  @scala.inline
  def klSlashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.klSlashh = this.cast("kl/h")
  @scala.inline
  def klSlashmin: typingsSlinky.convertDashUnits.convertDashUnitsStrings.klSlashmin = this.cast("kl/min")
  @scala.inline
  def klSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.klSlashs = this.cast("kl/s")
  @scala.inline
  def km: km_ = this.cast("km")
  @scala.inline
  def km2: typingsSlinky.convertDashUnits.convertDashUnitsStrings.km2 = this.cast("km2")
  @scala.inline
  def km3: typingsSlinky.convertDashUnits.convertDashUnitsStrings.km3 = this.cast("km3")
  @scala.inline
  def km3Slashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.km3Slashs = this.cast("km3/s")
  @scala.inline
  def kmSlashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.kmSlashh = this.cast("km/h")
  @scala.inline
  def knot: typingsSlinky.convertDashUnits.convertDashUnitsStrings.knot = this.cast("knot")
  @scala.inline
  def ksi: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ksi = this.cast("ksi")
  @scala.inline
  def l: typingsSlinky.convertDashUnits.convertDashUnitsStrings.l = this.cast("l")
  @scala.inline
  def lSlashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.lSlashh = this.cast("l/h")
  @scala.inline
  def lSlashmin: typingsSlinky.convertDashUnits.convertDashUnitsStrings.lSlashmin = this.cast("l/min")
  @scala.inline
  def lSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.lSlashs = this.cast("l/s")
  @scala.inline
  def lb: typingsSlinky.convertDashUnits.convertDashUnitsStrings.lb = this.cast("lb")
  @scala.inline
  def lx: typingsSlinky.convertDashUnits.convertDashUnitsStrings.lx = this.cast("lx")
  @scala.inline
  def m: typingsSlinky.convertDashUnits.convertDashUnitsStrings.m = this.cast("m")
  @scala.inline
  def m2: typingsSlinky.convertDashUnits.convertDashUnitsStrings.m2 = this.cast("m2")
  @scala.inline
  def m3: typingsSlinky.convertDashUnits.convertDashUnitsStrings.m3 = this.cast("m3")
  @scala.inline
  def m3Slashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.m3Slashh = this.cast("m3/h")
  @scala.inline
  def m3Slashmin: typingsSlinky.convertDashUnits.convertDashUnitsStrings.m3Slashmin = this.cast("m3/min")
  @scala.inline
  def m3Slashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.m3Slashs = this.cast("m3/s")
  @scala.inline
  def mA: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mA = this.cast("mA")
  @scala.inline
  def mHz: mHz_ = this.cast("mHz")
  @scala.inline
  def mSlashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mSlashh = this.cast("m/h")
  @scala.inline
  def mSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mSlashs = this.cast("m/s")
  @scala.inline
  def mV: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mV = this.cast("mV")
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
  def mcg: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mcg = this.cast("mcg")
  @scala.inline
  def mg: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mg = this.cast("mg")
  @scala.inline
  def mi: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mi = this.cast("mi")
  @scala.inline
  def mi2: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mi2 = this.cast("mi2")
  @scala.inline
  def min: typingsSlinky.convertDashUnits.convertDashUnitsStrings.min = this.cast("min")
  @scala.inline
  def minSlashkm: typingsSlinky.convertDashUnits.convertDashUnitsStrings.minSlashkm = this.cast("min/km")
  @scala.inline
  def ml: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ml = this.cast("ml")
  @scala.inline
  def mlSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mlSlashs = this.cast("ml/s")
  @scala.inline
  def mm: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mm = this.cast("mm")
  @scala.inline
  def mm2: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mm2 = this.cast("mm2")
  @scala.inline
  def mm3: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mm3 = this.cast("mm3")
  @scala.inline
  def mm3Slashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mm3Slashs = this.cast("mm3/s")
  @scala.inline
  def month: typingsSlinky.convertDashUnits.convertDashUnitsStrings.month = this.cast("month")
  @scala.inline
  def ms: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ms = this.cast("ms")
  @scala.inline
  def mt: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mt = this.cast("mt")
  @scala.inline
  def mu: typingsSlinky.convertDashUnits.convertDashUnitsStrings.mu = this.cast("mu")
  @scala.inline
  def ns: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ns = this.cast("ns")
  @scala.inline
  def oz: typingsSlinky.convertDashUnits.convertDashUnitsStrings.oz = this.cast("oz")
  @scala.inline
  def pnt: typingsSlinky.convertDashUnits.convertDashUnitsStrings.pnt = this.cast("pnt")
  @scala.inline
  def pntSlashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.pntSlashh = this.cast("pnt/h")
  @scala.inline
  def pntSlashmin: typingsSlinky.convertDashUnits.convertDashUnitsStrings.pntSlashmin = this.cast("pnt/min")
  @scala.inline
  def pntSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.pntSlashs = this.cast("pnt/s")
  @scala.inline
  def ppb: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ppb = this.cast("ppb")
  @scala.inline
  def ppm: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ppm = this.cast("ppm")
  @scala.inline
  def ppq: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ppq = this.cast("ppq")
  @scala.inline
  def ppt: typingsSlinky.convertDashUnits.convertDashUnitsStrings.ppt = this.cast("ppt")
  @scala.inline
  def psi: typingsSlinky.convertDashUnits.convertDashUnitsStrings.psi = this.cast("psi")
  @scala.inline
  def qt: typingsSlinky.convertDashUnits.convertDashUnitsStrings.qt = this.cast("qt")
  @scala.inline
  def qtSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.qtSlashs = this.cast("qt/s")
  @scala.inline
  def rad: typingsSlinky.convertDashUnits.convertDashUnitsStrings.rad = this.cast("rad")
  @scala.inline
  def radSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.radSlashs = this.cast("rad/s")
  @scala.inline
  def rpm: typingsSlinky.convertDashUnits.convertDashUnitsStrings.rpm = this.cast("rpm")
  @scala.inline
  def s: typingsSlinky.convertDashUnits.convertDashUnitsStrings.s = this.cast("s")
  @scala.inline
  def sSlashft: typingsSlinky.convertDashUnits.convertDashUnitsStrings.sSlashft = this.cast("s/ft")
  @scala.inline
  def sSlashm: typingsSlinky.convertDashUnits.convertDashUnitsStrings.sSlashm = this.cast("s/m")
  @scala.inline
  def t: typingsSlinky.convertDashUnits.convertDashUnitsStrings.t = this.cast("t")
  @scala.inline
  def torr: typingsSlinky.convertDashUnits.convertDashUnitsStrings.torr = this.cast("torr")
  @scala.inline
  def tsp: typingsSlinky.convertDashUnits.convertDashUnitsStrings.tsp = this.cast("tsp")
  @scala.inline
  def tspSlashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.tspSlashs = this.cast("tsp/s")
  @scala.inline
  def week: typingsSlinky.convertDashUnits.convertDashUnitsStrings.week = this.cast("week")
  @scala.inline
  def yd3: typingsSlinky.convertDashUnits.convertDashUnitsStrings.yd3 = this.cast("yd3")
  @scala.inline
  def yd3Slashh: typingsSlinky.convertDashUnits.convertDashUnitsStrings.yd3Slashh = this.cast("yd3/h")
  @scala.inline
  def yd3Slashmin: typingsSlinky.convertDashUnits.convertDashUnitsStrings.yd3Slashmin = this.cast("yd3/min")
  @scala.inline
  def yd3Slashs: typingsSlinky.convertDashUnits.convertDashUnitsStrings.yd3Slashs = this.cast("yd3/s")
  @scala.inline
  def year: typingsSlinky.convertDashUnits.convertDashUnitsStrings.year = this.cast("year")
}

