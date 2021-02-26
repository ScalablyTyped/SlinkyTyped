package typingsSlinky.babelPresetEnv

import typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`true`
import typingsSlinky.babelPresetEnv.babelPresetEnvStrings.current
import typingsSlinky.babelPresetEnv.babelPresetEnvStrings.tp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type BrowserslistQuery = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.babelPresetEnv.mod.CorejsVersion
    - typingsSlinky.babelPresetEnv.anon.Proposals
  */
  trait CorejsOption extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.babelPresetEnv.babelPresetEnvNumbers.`2`
    - typingsSlinky.babelPresetEnv.babelPresetEnvNumbers.`3`
  */
  trait CorejsVersion extends CorejsOption
  object CorejsVersion {
    
    @scala.inline
    def `2`: typingsSlinky.babelPresetEnv.babelPresetEnvNumbers.`2` = 2.asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.babelPresetEnv.babelPresetEnvNumbers.`3` = 3.asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvNumbers.`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`false`
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.amd
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.umd
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.systemjs
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.commonjs
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.cjs
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.auto
  */
  trait ModuleOption extends StObject
  object ModuleOption {
    
    @scala.inline
    def amd: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.amd = "amd".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.amd]
    
    @scala.inline
    def auto: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.auto = "auto".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.auto]
    
    @scala.inline
    def cjs: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.cjs = "cjs".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.cjs]
    
    @scala.inline
    def commonjs: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.commonjs = "commonjs".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.commonjs]
    
    @scala.inline
    def `false`: typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`false` = false.asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`false`]
    
    @scala.inline
    def systemjs: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.systemjs = "systemjs".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.systemjs]
    
    @scala.inline
    def umd: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.umd = "umd".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.umd]
  }
  
  @js.native
  trait Options extends StObject {
    
    var bugfixes: js.UndefOr[Boolean] = js.native
    
    var configPath: js.UndefOr[String] = js.native
    
    var corejs: js.UndefOr[CorejsOption] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var exclude: js.UndefOr[PluginList] = js.native
    
    var forceAllTransforms: js.UndefOr[Boolean] = js.native
    
    var ignoreBrowserslistConfig: js.UndefOr[Boolean] = js.native
    
    var include: js.UndefOr[PluginList] = js.native
    
    var loose: js.UndefOr[Boolean] = js.native
    
    var modules: js.UndefOr[ModuleOption] = js.native
    
    var shippedProposals: js.UndefOr[Boolean] = js.native
    
    var spec: js.UndefOr[Boolean] = js.native
    
    var targets: js.UndefOr[TargetsOptions] = js.native
    
    var useBuiltIns: js.UndefOr[UseBuiltInsOption] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBugfixes(value: Boolean): Self = StObject.set(x, "bugfixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBugfixesUndefined: Self = StObject.set(x, "bugfixes", js.undefined)
      
      @scala.inline
      def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      @scala.inline
      def setCorejs(value: CorejsOption): Self = StObject.set(x, "corejs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorejsUndefined: Self = StObject.set(x, "corejs", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setExclude(value: PluginList): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: PluginListItem*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setForceAllTransforms(value: Boolean): Self = StObject.set(x, "forceAllTransforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAllTransformsUndefined: Self = StObject.set(x, "forceAllTransforms", js.undefined)
      
      @scala.inline
      def setIgnoreBrowserslistConfig(value: Boolean): Self = StObject.set(x, "ignoreBrowserslistConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBrowserslistConfigUndefined: Self = StObject.set(x, "ignoreBrowserslistConfig", js.undefined)
      
      @scala.inline
      def setInclude(value: PluginList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: PluginListItem*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
      
      @scala.inline
      def setModules(value: ModuleOption): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setShippedProposals(value: Boolean): Self = StObject.set(x, "shippedProposals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippedProposalsUndefined: Self = StObject.set(x, "shippedProposals", js.undefined)
      
      @scala.inline
      def setSpec(value: Boolean): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      @scala.inline
      def setTargets(value: TargetsOptions): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: BrowserslistQuery*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      @scala.inline
      def setUseBuiltIns(value: UseBuiltInsOption): Self = StObject.set(x, "useBuiltIns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBuiltInsUndefined: Self = StObject.set(x, "useBuiltIns", js.undefined)
    }
  }
  
  type PluginList = js.Array[PluginListItem]
  
  type PluginListItem = String | js.RegExp
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Android
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Baidu
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.BlackBerry
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.bb
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Chrome
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_chr
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Edge
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Electron
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Explorer
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ie
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ie_mob
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Firefox
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ff
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_ff
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.iOS
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ios_saf
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Node
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Opera
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.OperaMini
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.op_mini
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.OperaMobile
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.op_mob
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.QQAndroid
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_qq
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Safari
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Samsung
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.UCAndroid
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_uc
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.kaios
  */
  trait Target extends StObject
  object Target {
    
    @scala.inline
    def Android: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Android = "Android".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Android]
    
    @scala.inline
    def Baidu: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Baidu = "Baidu".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Baidu]
    
    @scala.inline
    def BlackBerry: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.BlackBerry = "BlackBerry".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.BlackBerry]
    
    @scala.inline
    def Chrome: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Chrome = "Chrome".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Chrome]
    
    @scala.inline
    def ChromeAndroid: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid = "ChromeAndroid".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid]
    
    @scala.inline
    def Edge: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Edge = "Edge".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Edge]
    
    @scala.inline
    def Electron: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Electron = "Electron".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Electron]
    
    @scala.inline
    def Explorer: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Explorer = "Explorer".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Explorer]
    
    @scala.inline
    def ExplorerMobile: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile = "ExplorerMobile".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile]
    
    @scala.inline
    def Firefox: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Firefox = "Firefox".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Firefox]
    
    @scala.inline
    def FirefoxAndroid: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid = "FirefoxAndroid".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid]
    
    @scala.inline
    def Node: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Node = "Node".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Node]
    
    @scala.inline
    def Opera: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Opera = "Opera".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Opera]
    
    @scala.inline
    def OperaMini: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.OperaMini = "OperaMini".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.OperaMini]
    
    @scala.inline
    def OperaMobile: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.OperaMobile = "OperaMobile".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.OperaMobile]
    
    @scala.inline
    def QQAndroid: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.QQAndroid = "QQAndroid".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.QQAndroid]
    
    @scala.inline
    def Safari: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Safari = "Safari".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Safari]
    
    @scala.inline
    def Samsung: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Samsung = "Samsung".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.Samsung]
    
    @scala.inline
    def UCAndroid: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.UCAndroid = "UCAndroid".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.UCAndroid]
    
    @scala.inline
    def and_chr: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_chr = "and_chr".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_chr]
    
    @scala.inline
    def and_ff: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_ff = "and_ff".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_ff]
    
    @scala.inline
    def and_qq: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_qq = "and_qq".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_qq]
    
    @scala.inline
    def and_uc: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_uc = "and_uc".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.and_uc]
    
    @scala.inline
    def bb: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.bb = "bb".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.bb]
    
    @scala.inline
    def ff: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ff = "ff".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ff]
    
    @scala.inline
    def iOS: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.iOS = "iOS".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.iOS]
    
    @scala.inline
    def ie: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ie = "ie".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ie]
    
    @scala.inline
    def ie_mob: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ie_mob = "ie_mob".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ie_mob]
    
    @scala.inline
    def ios_saf: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ios_saf = "ios_saf".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.ios_saf]
    
    @scala.inline
    def kaios: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.kaios = "kaios".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.kaios]
    
    @scala.inline
    def op_mini: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.op_mini = "op_mini".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.op_mini]
    
    @scala.inline
    def op_mob: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.op_mob = "op_mob".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.op_mob]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.babelPresetEnv.mod.BrowserslistQuery
    - js.Array[typingsSlinky.babelPresetEnv.mod.BrowserslistQuery]
    - typingsSlinky.babelPresetEnv.anon.keyinTargetstring
    - typingsSlinky.babelPresetEnv.anon.Esmodules
    - typingsSlinky.babelPresetEnv.anon.Node
    - typingsSlinky.babelPresetEnv.anon.Safari
    - typingsSlinky.babelPresetEnv.anon.Browsers
  */
  type TargetsOptions = _TargetsOptions | js.Array[BrowserslistQuery] | BrowserslistQuery
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`false`
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.usage
    - typingsSlinky.babelPresetEnv.babelPresetEnvStrings.entry
  */
  trait UseBuiltInsOption extends StObject
  object UseBuiltInsOption {
    
    @scala.inline
    def entry: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.entry = "entry".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.entry]
    
    @scala.inline
    def `false`: typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`false` = false.asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`false`]
    
    @scala.inline
    def usage: typingsSlinky.babelPresetEnv.babelPresetEnvStrings.usage = "usage".asInstanceOf[typingsSlinky.babelPresetEnv.babelPresetEnvStrings.usage]
  }
  
  trait _TargetsOptions extends StObject
  object _TargetsOptions {
    
    @scala.inline
    def Browsers(browsers: String | js.Array[String]): typingsSlinky.babelPresetEnv.anon.Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.babelPresetEnv.anon.Browsers]
    }
    
    @scala.inline
    def Esmodules(esmodules: `true`): typingsSlinky.babelPresetEnv.anon.Esmodules = {
      val __obj = js.Dynamic.literal(esmodules = esmodules.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.babelPresetEnv.anon.Esmodules]
    }
    
    @scala.inline
    def Node(node: String | current | `true`): typingsSlinky.babelPresetEnv.anon.Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.babelPresetEnv.anon.Node]
    }
    
    @scala.inline
    def Safari(safari: String | tp): typingsSlinky.babelPresetEnv.anon.Safari = {
      val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.babelPresetEnv.anon.Safari]
    }
    
    @scala.inline
    def keyinTargetstring(): typingsSlinky.babelPresetEnv.anon.keyinTargetstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.babelPresetEnv.anon.keyinTargetstring]
    }
  }
}
