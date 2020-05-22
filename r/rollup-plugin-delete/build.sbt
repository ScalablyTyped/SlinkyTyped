organization := "org.scalablytyped.slinky"
name := "rollup-plugin-delete"
version := "1.2.0-e243e2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "braces" % "3.0-dt-20200515Z-195808",
  "org.scalablytyped.slinky" %%% "del" % "5.1.0-9590f5",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200515Z-8cb760",
  "org.scalablytyped.slinky" %%% "fast-glob" % "2.2.7-386b01",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200515Z-90a207",
  "org.scalablytyped.slinky" %%% "globby" % "10.0.2-7d9dc8",
  "org.scalablytyped.slinky" %%% "micromatch" % "4.0-dt-20200515Z-9a1539",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-9d1960",
  "org.scalablytyped.slinky" %%% "mrmlnc__readdir-enhanced" % "2.2.1-ca6dbf",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "rollup" % "1.32.1-d427d3",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
