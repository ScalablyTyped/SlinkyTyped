package typingsSlinky.pulumiKubernetes.mod

import typingsSlinky.pulumiKubernetes.v2HelmMod.ChartOpts
import typingsSlinky.pulumiKubernetes.v2HelmMod.LocalChartOpts
import typingsSlinky.pulumiKubernetes.v2HelmMod.ResolvedFetchOpts
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helm {
  
  object v2 {
    
    @JSImport("@pulumi/kubernetes", "helm.v2.Chart")
    @js.native
    class Chart protected ()
      extends typingsSlinky.pulumiKubernetes.helmMod.v2.Chart {
      /**
        * Create an instance of the specified Helm chart.
        * @param releaseName Name of the Chart (e.g., nginx-ingress).
        * @param config Configuration options for the Chart.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(releaseName: String, config: ChartOpts) = this()
      def this(releaseName: String, config: LocalChartOpts) = this()
      def this(releaseName: String, config: ChartOpts, opts: ComponentResourceOptions) = this()
      def this(releaseName: String, config: LocalChartOpts, opts: ComponentResourceOptions) = this()
    }
    
    @JSImport("@pulumi/kubernetes", "helm.v2.fetch")
    @js.native
    def fetch(chart: String): Unit = js.native
    @JSImport("@pulumi/kubernetes", "helm.v2.fetch")
    @js.native
    def fetch(chart: String, opts: ResolvedFetchOpts): Unit = js.native
  }
  
  object v3 {
    
    @JSImport("@pulumi/kubernetes", "helm.v3.Chart")
    @js.native
    class Chart protected ()
      extends typingsSlinky.pulumiKubernetes.helmMod.v3.Chart {
      /**
        * Create an instance of the specified Helm chart.
        * @param releaseName Name of the Chart (e.g., nginx-ingress).
        * @param config Configuration options for the Chart.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(releaseName: String, config: typingsSlinky.pulumiKubernetes.v3HelmMod.ChartOpts) = this()
      def this(releaseName: String, config: typingsSlinky.pulumiKubernetes.v3HelmMod.LocalChartOpts) = this()
      def this(
        releaseName: String,
        config: typingsSlinky.pulumiKubernetes.v3HelmMod.ChartOpts,
        opts: ComponentResourceOptions
      ) = this()
      def this(
        releaseName: String,
        config: typingsSlinky.pulumiKubernetes.v3HelmMod.LocalChartOpts,
        opts: ComponentResourceOptions
      ) = this()
    }
  }
}
