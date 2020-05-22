organization := "org.scalablytyped.slinky"
name := "activex-excel"
version := "14.0-dt-20200515Z-f609e9"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "activex-adodb" % "6.1-dt-20200515Z-07cb6c",
  "org.scalablytyped.slinky" %%% "activex-dao" % "16.0-dt-20200515Z-415719",
  "org.scalablytyped.slinky" %%% "activex-office" % "16.0-dt-20200515Z-923b04",
  "org.scalablytyped.slinky" %%% "activex-outlook" % "14.0-dt-20200515Z-94c842",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20200515Z-e69e41",
  "org.scalablytyped.slinky" %%% "activex-vbide" % "14.0-dt-20200515Z-bd070c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
