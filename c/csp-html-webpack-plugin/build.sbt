organization := "org.scalablytyped.slinky"
name := "csp-html-webpack-plugin"
version := "3.0-dt-20190926Z-d0d7a7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "html-minifier-terser" % "5.1-dt-20200923Z-02c3c8",
  "org.scalablytyped.slinky" %%% "html-webpack-plugin" % "4.5.0-3b258b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20201002Z-d49ad3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
