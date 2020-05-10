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
  def A: typingsSlinky.convertUnits.convertUnitsStrings.A = "A".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.A]
  @scala.inline
  def B: typingsSlinky.convertUnits.convertUnitsStrings.B = "B".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.B]
  @scala.inline
  def C: typingsSlinky.convertUnits.convertUnitsStrings.C = "C".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.C]
  @scala.inline
  def F: typingsSlinky.convertUnits.convertUnitsStrings.F = "F".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.F]
  @scala.inline
  def GB: typingsSlinky.convertUnits.convertUnitsStrings.GB = "GB".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.GB]
  @scala.inline
  def GHz: typingsSlinky.convertUnits.convertUnitsStrings.GHz = "GHz".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.GHz]
  @scala.inline
  def GVA: typingsSlinky.convertUnits.convertUnitsStrings.GVA = "GVA".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.GVA]
  @scala.inline
  def GVAR: typingsSlinky.convertUnits.convertUnitsStrings.GVAR = "GVAR".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.GVAR]
  @scala.inline
  def GVARH: typingsSlinky.convertUnits.convertUnitsStrings.GVARH = "GVARH".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.GVARH]
  @scala.inline
  def GW: typingsSlinky.convertUnits.convertUnitsStrings.GW = "GW".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.GW]
  @scala.inline
  def GWh: typingsSlinky.convertUnits.convertUnitsStrings.GWh = "GWh".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.GWh]
  @scala.inline
  def Gb: Gb_ = "Gb".asInstanceOf[Gb_]
  @scala.inline
  def Hz: typingsSlinky.convertUnits.convertUnitsStrings.Hz = "Hz".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.Hz]
  @scala.inline
  def J: typingsSlinky.convertUnits.convertUnitsStrings.J = "J".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.J]
  @scala.inline
  def K: typingsSlinky.convertUnits.convertUnitsStrings.K = "K".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.K]
  @scala.inline
  def KB: typingsSlinky.convertUnits.convertUnitsStrings.KB = "KB".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.KB]
  @scala.inline
  def Kb: Kb_ = "Kb".asInstanceOf[Kb_]
  @scala.inline
  def MB: typingsSlinky.convertUnits.convertUnitsStrings.MB = "MB".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.MB]
  @scala.inline
  def MHz: typingsSlinky.convertUnits.convertUnitsStrings.MHz = "MHz".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.MHz]
  @scala.inline
  def MPa: typingsSlinky.convertUnits.convertUnitsStrings.MPa = "MPa".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.MPa]
  @scala.inline
  def MVA: typingsSlinky.convertUnits.convertUnitsStrings.MVA = "MVA".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.MVA]
  @scala.inline
  def MVAR: typingsSlinky.convertUnits.convertUnitsStrings.MVAR = "MVAR".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.MVAR]
  @scala.inline
  def MVARh: typingsSlinky.convertUnits.convertUnitsStrings.MVARh = "MVARh".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.MVARh]
  @scala.inline
  def MW: typingsSlinky.convertUnits.convertUnitsStrings.MW = "MW".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.MW]
  @scala.inline
  def MWh: typingsSlinky.convertUnits.convertUnitsStrings.MWh = "MWh".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.MWh]
  @scala.inline
  def Mb: Mb_ = "Mb".asInstanceOf[Mb_]
  @scala.inline
  def Pa: typingsSlinky.convertUnits.convertUnitsStrings.Pa = "Pa".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.Pa]
  @scala.inline
  def R: typingsSlinky.convertUnits.convertUnitsStrings.R = "R".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.R]
  @scala.inline
  def TB: typingsSlinky.convertUnits.convertUnitsStrings.TB = "TB".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.TB]
  @scala.inline
  def THz: typingsSlinky.convertUnits.convertUnitsStrings.THz = "THz".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.THz]
  @scala.inline
  def Tb: Tb_ = "Tb".asInstanceOf[Tb_]
  @scala.inline
  def Tbs: typingsSlinky.convertUnits.convertUnitsStrings.Tbs = "Tbs".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.Tbs]
  @scala.inline
  def TbsSlashs: typingsSlinky.convertUnits.convertUnitsStrings.TbsSlashs = "Tbs/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.TbsSlashs]
  @scala.inline
  def V: typingsSlinky.convertUnits.convertUnitsStrings.V = "V".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.V]
  @scala.inline
  def VA: typingsSlinky.convertUnits.convertUnitsStrings.VA = "VA".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.VA]
  @scala.inline
  def VAR: typingsSlinky.convertUnits.convertUnitsStrings.VAR = "VAR".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.VAR]
  @scala.inline
  def VARh: typingsSlinky.convertUnits.convertUnitsStrings.VARh = "VARh".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.VARh]
  @scala.inline
  def W: typingsSlinky.convertUnits.convertUnitsStrings.W = "W".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.W]
  @scala.inline
  def Wh: typingsSlinky.convertUnits.convertUnitsStrings.Wh = "Wh".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.Wh]
  @scala.inline
  def ac: typingsSlinky.convertUnits.convertUnitsStrings.ac = "ac".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ac]
  @scala.inline
  def arcmin: typingsSlinky.convertUnits.convertUnitsStrings.arcmin = "arcmin".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.arcmin]
  @scala.inline
  def arcsec: typingsSlinky.convertUnits.convertUnitsStrings.arcsec = "arcsec".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.arcsec]
  @scala.inline
  def b: b_ = "b".asInstanceOf[b_]
  @scala.inline
  def bar: typingsSlinky.convertUnits.convertUnitsStrings.bar = "bar".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.bar]
  @scala.inline
  def clSlashs: typingsSlinky.convertUnits.convertUnitsStrings.clSlashs = "cl/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.clSlashs]
  @scala.inline
  def cm: typingsSlinky.convertUnits.convertUnitsStrings.cm = "cm".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.cm]
  @scala.inline
  def cm2: typingsSlinky.convertUnits.convertUnitsStrings.cm2 = "cm2".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.cm2]
  @scala.inline
  def cm3: typingsSlinky.convertUnits.convertUnitsStrings.cm3 = "cm3".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.cm3]
  @scala.inline
  def cm3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.cm3Slashs = "cm3/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.cm3Slashs]
  @scala.inline
  def cup: typingsSlinky.convertUnits.convertUnitsStrings.cup = "cup".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.cup]
  @scala.inline
  def cupSlashs: typingsSlinky.convertUnits.convertUnitsStrings.cupSlashs = "cup/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.cupSlashs]
  @scala.inline
  def d: typingsSlinky.convertUnits.convertUnitsStrings.d = "d".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.d]
  @scala.inline
  def deg: typingsSlinky.convertUnits.convertUnitsStrings.deg = "deg".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.deg]
  @scala.inline
  def degSlashs: typingsSlinky.convertUnits.convertUnitsStrings.degSlashs = "deg/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.degSlashs]
  @scala.inline
  def dlSlashs: typingsSlinky.convertUnits.convertUnitsStrings.dlSlashs = "dl/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.dlSlashs]
  @scala.inline
  def `fl-oz`: typingsSlinky.convertUnits.convertUnitsStrings.`fl-oz` = "fl-oz".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.`fl-oz`]
  @scala.inline
  def `fl-ozSlashh`: typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashh` = "fl-oz/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashh`]
  @scala.inline
  def `fl-ozSlashmin`: typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashmin` = "fl-oz/min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashmin`]
  @scala.inline
  def `fl-ozSlashs`: typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashs` = "fl-oz/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.`fl-ozSlashs`]
  @scala.inline
  def ft: typingsSlinky.convertUnits.convertUnitsStrings.ft = "ft".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ft]
  @scala.inline
  def `ft-cd`: typingsSlinky.convertUnits.convertUnitsStrings.`ft-cd` = "ft-cd".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.`ft-cd`]
  @scala.inline
  def `ft-us`: typingsSlinky.convertUnits.convertUnitsStrings.`ft-us` = "ft-us".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.`ft-us`]
  @scala.inline
  def ft2: typingsSlinky.convertUnits.convertUnitsStrings.ft2 = "ft2".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ft2]
  @scala.inline
  def ft3: typingsSlinky.convertUnits.convertUnitsStrings.ft3 = "ft3".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ft3]
  @scala.inline
  def ft3Slashh: typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashh = "ft3/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashh]
  @scala.inline
  def ft3Slashmin: typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashmin = "ft3/min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashmin]
  @scala.inline
  def ft3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashs = "ft3/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ft3Slashs]
  @scala.inline
  def ftSlashs: typingsSlinky.convertUnits.convertUnitsStrings.ftSlashs = "ft/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ftSlashs]
  @scala.inline
  def g: typingsSlinky.convertUnits.convertUnitsStrings.g = "g".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.g]
  @scala.inline
  def gal: typingsSlinky.convertUnits.convertUnitsStrings.gal = "gal".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.gal]
  @scala.inline
  def galSlashh: typingsSlinky.convertUnits.convertUnitsStrings.galSlashh = "gal/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.galSlashh]
  @scala.inline
  def galSlashmin: typingsSlinky.convertUnits.convertUnitsStrings.galSlashmin = "gal/min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.galSlashmin]
  @scala.inline
  def galSlashs: typingsSlinky.convertUnits.convertUnitsStrings.galSlashs = "gal/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.galSlashs]
  @scala.inline
  def grad: typingsSlinky.convertUnits.convertUnitsStrings.grad = "grad".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.grad]
  @scala.inline
  def h: typingsSlinky.convertUnits.convertUnitsStrings.h = "h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.h]
  @scala.inline
  def hPa: typingsSlinky.convertUnits.convertUnitsStrings.hPa = "hPa".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.hPa]
  @scala.inline
  def ha: typingsSlinky.convertUnits.convertUnitsStrings.ha = "ha".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ha]
  @scala.inline
  def in: typingsSlinky.convertUnits.convertUnitsStrings.in = "in".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.in]
  @scala.inline
  def in2: typingsSlinky.convertUnits.convertUnitsStrings.in2 = "in2".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.in2]
  @scala.inline
  def in3: typingsSlinky.convertUnits.convertUnitsStrings.in3 = "in3".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.in3]
  @scala.inline
  def in3Slashh: typingsSlinky.convertUnits.convertUnitsStrings.in3Slashh = "in3/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.in3Slashh]
  @scala.inline
  def in3Slashmin: typingsSlinky.convertUnits.convertUnitsStrings.in3Slashmin = "in3/min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.in3Slashmin]
  @scala.inline
  def in3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.in3Slashs = "in3/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.in3Slashs]
  @scala.inline
  def kA: typingsSlinky.convertUnits.convertUnitsStrings.kA = "kA".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kA]
  @scala.inline
  def kHz: typingsSlinky.convertUnits.convertUnitsStrings.kHz = "kHz".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kHz]
  @scala.inline
  def kJ: typingsSlinky.convertUnits.convertUnitsStrings.kJ = "kJ".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kJ]
  @scala.inline
  def kM: typingsSlinky.convertUnits.convertUnitsStrings.kM = "kM".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kM]
  @scala.inline
  def kPa: typingsSlinky.convertUnits.convertUnitsStrings.kPa = "kPa".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kPa]
  @scala.inline
  def kV: typingsSlinky.convertUnits.convertUnitsStrings.kV = "kV".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kV]
  @scala.inline
  def kVA: typingsSlinky.convertUnits.convertUnitsStrings.kVA = "kVA".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kVA]
  @scala.inline
  def kVAR: typingsSlinky.convertUnits.convertUnitsStrings.kVAR = "kVAR".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kVAR]
  @scala.inline
  def kVARh: typingsSlinky.convertUnits.convertUnitsStrings.kVARh = "kVARh".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kVARh]
  @scala.inline
  def kWh: typingsSlinky.convertUnits.convertUnitsStrings.kWh = "kWh".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kWh]
  @scala.inline
  def kg: typingsSlinky.convertUnits.convertUnitsStrings.kg = "kg".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kg]
  @scala.inline
  def kl: typingsSlinky.convertUnits.convertUnitsStrings.kl = "kl".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kl]
  @scala.inline
  def klSlashh: typingsSlinky.convertUnits.convertUnitsStrings.klSlashh = "kl/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.klSlashh]
  @scala.inline
  def klSlashmin: typingsSlinky.convertUnits.convertUnitsStrings.klSlashmin = "kl/min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.klSlashmin]
  @scala.inline
  def klSlashs: typingsSlinky.convertUnits.convertUnitsStrings.klSlashs = "kl/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.klSlashs]
  @scala.inline
  def km: km_ = "km".asInstanceOf[km_]
  @scala.inline
  def km2: typingsSlinky.convertUnits.convertUnitsStrings.km2 = "km2".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.km2]
  @scala.inline
  def km3: typingsSlinky.convertUnits.convertUnitsStrings.km3 = "km3".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.km3]
  @scala.inline
  def km3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.km3Slashs = "km3/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.km3Slashs]
  @scala.inline
  def kmSlashh: typingsSlinky.convertUnits.convertUnitsStrings.kmSlashh = "km/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.kmSlashh]
  @scala.inline
  def knot: typingsSlinky.convertUnits.convertUnitsStrings.knot = "knot".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.knot]
  @scala.inline
  def ksi: typingsSlinky.convertUnits.convertUnitsStrings.ksi = "ksi".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ksi]
  @scala.inline
  def l: typingsSlinky.convertUnits.convertUnitsStrings.l = "l".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.l]
  @scala.inline
  def lSlashh: typingsSlinky.convertUnits.convertUnitsStrings.lSlashh = "l/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.lSlashh]
  @scala.inline
  def lSlashmin: typingsSlinky.convertUnits.convertUnitsStrings.lSlashmin = "l/min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.lSlashmin]
  @scala.inline
  def lSlashs: typingsSlinky.convertUnits.convertUnitsStrings.lSlashs = "l/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.lSlashs]
  @scala.inline
  def lb: typingsSlinky.convertUnits.convertUnitsStrings.lb = "lb".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.lb]
  @scala.inline
  def lx: typingsSlinky.convertUnits.convertUnitsStrings.lx = "lx".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.lx]
  @scala.inline
  def m: typingsSlinky.convertUnits.convertUnitsStrings.m = "m".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.m]
  @scala.inline
  def m2: typingsSlinky.convertUnits.convertUnitsStrings.m2 = "m2".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.m2]
  @scala.inline
  def m3: typingsSlinky.convertUnits.convertUnitsStrings.m3 = "m3".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.m3]
  @scala.inline
  def m3Slashh: typingsSlinky.convertUnits.convertUnitsStrings.m3Slashh = "m3/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.m3Slashh]
  @scala.inline
  def m3Slashmin: typingsSlinky.convertUnits.convertUnitsStrings.m3Slashmin = "m3/min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.m3Slashmin]
  @scala.inline
  def m3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.m3Slashs = "m3/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.m3Slashs]
  @scala.inline
  def mA: typingsSlinky.convertUnits.convertUnitsStrings.mA = "mA".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mA]
  @scala.inline
  def mHz: mHz_ = "mHz".asInstanceOf[mHz_]
  @scala.inline
  def mSlashh: typingsSlinky.convertUnits.convertUnitsStrings.mSlashh = "m/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mSlashh]
  @scala.inline
  def mSlashs: typingsSlinky.convertUnits.convertUnitsStrings.mSlashs = "m/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mSlashs]
  @scala.inline
  def mV: typingsSlinky.convertUnits.convertUnitsStrings.mV = "mV".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mV]
  @scala.inline
  def mVA: mVA_ = "mVA".asInstanceOf[mVA_]
  @scala.inline
  def mVAR: mVAR_ = "mVAR".asInstanceOf[mVAR_]
  @scala.inline
  def mVARh: mVARh_ = "mVARh".asInstanceOf[mVARh_]
  @scala.inline
  def mW: mW_ = "mW".asInstanceOf[mW_]
  @scala.inline
  def mWh: mWh_ = "mWh".asInstanceOf[mWh_]
  @scala.inline
  def mcg: typingsSlinky.convertUnits.convertUnitsStrings.mcg = "mcg".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mcg]
  @scala.inline
  def mg: typingsSlinky.convertUnits.convertUnitsStrings.mg = "mg".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mg]
  @scala.inline
  def mi: typingsSlinky.convertUnits.convertUnitsStrings.mi = "mi".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mi]
  @scala.inline
  def mi2: typingsSlinky.convertUnits.convertUnitsStrings.mi2 = "mi2".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mi2]
  @scala.inline
  def min: typingsSlinky.convertUnits.convertUnitsStrings.min = "min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.min]
  @scala.inline
  def minSlashkm: typingsSlinky.convertUnits.convertUnitsStrings.minSlashkm = "min/km".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.minSlashkm]
  @scala.inline
  def ml: typingsSlinky.convertUnits.convertUnitsStrings.ml = "ml".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ml]
  @scala.inline
  def mlSlashs: typingsSlinky.convertUnits.convertUnitsStrings.mlSlashs = "ml/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mlSlashs]
  @scala.inline
  def mm: typingsSlinky.convertUnits.convertUnitsStrings.mm = "mm".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mm]
  @scala.inline
  def mm2: typingsSlinky.convertUnits.convertUnitsStrings.mm2 = "mm2".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mm2]
  @scala.inline
  def mm3: typingsSlinky.convertUnits.convertUnitsStrings.mm3 = "mm3".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mm3]
  @scala.inline
  def mm3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.mm3Slashs = "mm3/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mm3Slashs]
  @scala.inline
  def month: typingsSlinky.convertUnits.convertUnitsStrings.month = "month".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.month]
  @scala.inline
  def ms: typingsSlinky.convertUnits.convertUnitsStrings.ms = "ms".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ms]
  @scala.inline
  def mt: typingsSlinky.convertUnits.convertUnitsStrings.mt = "mt".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mt]
  @scala.inline
  def mu: typingsSlinky.convertUnits.convertUnitsStrings.mu = "mu".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.mu]
  @scala.inline
  def ns: typingsSlinky.convertUnits.convertUnitsStrings.ns = "ns".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ns]
  @scala.inline
  def oz: typingsSlinky.convertUnits.convertUnitsStrings.oz = "oz".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.oz]
  @scala.inline
  def pnt: typingsSlinky.convertUnits.convertUnitsStrings.pnt = "pnt".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.pnt]
  @scala.inline
  def pntSlashh: typingsSlinky.convertUnits.convertUnitsStrings.pntSlashh = "pnt/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.pntSlashh]
  @scala.inline
  def pntSlashmin: typingsSlinky.convertUnits.convertUnitsStrings.pntSlashmin = "pnt/min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.pntSlashmin]
  @scala.inline
  def pntSlashs: typingsSlinky.convertUnits.convertUnitsStrings.pntSlashs = "pnt/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.pntSlashs]
  @scala.inline
  def ppb: typingsSlinky.convertUnits.convertUnitsStrings.ppb = "ppb".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ppb]
  @scala.inline
  def ppm: typingsSlinky.convertUnits.convertUnitsStrings.ppm = "ppm".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ppm]
  @scala.inline
  def ppq: typingsSlinky.convertUnits.convertUnitsStrings.ppq = "ppq".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ppq]
  @scala.inline
  def ppt: typingsSlinky.convertUnits.convertUnitsStrings.ppt = "ppt".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.ppt]
  @scala.inline
  def psi: typingsSlinky.convertUnits.convertUnitsStrings.psi = "psi".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.psi]
  @scala.inline
  def qt: typingsSlinky.convertUnits.convertUnitsStrings.qt = "qt".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.qt]
  @scala.inline
  def qtSlashs: typingsSlinky.convertUnits.convertUnitsStrings.qtSlashs = "qt/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.qtSlashs]
  @scala.inline
  def rad: typingsSlinky.convertUnits.convertUnitsStrings.rad = "rad".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.rad]
  @scala.inline
  def radSlashs: typingsSlinky.convertUnits.convertUnitsStrings.radSlashs = "rad/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.radSlashs]
  @scala.inline
  def rpm: typingsSlinky.convertUnits.convertUnitsStrings.rpm = "rpm".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.rpm]
  @scala.inline
  def s: typingsSlinky.convertUnits.convertUnitsStrings.s = "s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.s]
  @scala.inline
  def sSlashft: typingsSlinky.convertUnits.convertUnitsStrings.sSlashft = "s/ft".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.sSlashft]
  @scala.inline
  def sSlashm: typingsSlinky.convertUnits.convertUnitsStrings.sSlashm = "s/m".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.sSlashm]
  @scala.inline
  def t: typingsSlinky.convertUnits.convertUnitsStrings.t = "t".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.t]
  @scala.inline
  def torr: typingsSlinky.convertUnits.convertUnitsStrings.torr = "torr".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.torr]
  @scala.inline
  def tsp: typingsSlinky.convertUnits.convertUnitsStrings.tsp = "tsp".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.tsp]
  @scala.inline
  def tspSlashs: typingsSlinky.convertUnits.convertUnitsStrings.tspSlashs = "tsp/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.tspSlashs]
  @scala.inline
  def week: typingsSlinky.convertUnits.convertUnitsStrings.week = "week".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.week]
  @scala.inline
  def yd3: typingsSlinky.convertUnits.convertUnitsStrings.yd3 = "yd3".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.yd3]
  @scala.inline
  def yd3Slashh: typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashh = "yd3/h".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashh]
  @scala.inline
  def yd3Slashmin: typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashmin = "yd3/min".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashmin]
  @scala.inline
  def yd3Slashs: typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashs = "yd3/s".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.yd3Slashs]
  @scala.inline
  def year: typingsSlinky.convertUnits.convertUnitsStrings.year = "year".asInstanceOf[typingsSlinky.convertUnits.convertUnitsStrings.year]
}

