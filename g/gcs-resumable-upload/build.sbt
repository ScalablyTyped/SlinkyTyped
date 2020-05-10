organization := "org.scalablytyped.slinky"
name := "gcs-resumable-upload"
version := "2.3.0-7487a1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "configstore" % "4.0-dt-20181202Z-1fefac",
  "org.scalablytyped.slinky" %%% "duplexify" % "3.6-dt-20181030Z-f15d9b",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-5cac52",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-4482ef",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-8bc924",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "pumpify" % "1.4-dt-20181017Z-0207ae",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
